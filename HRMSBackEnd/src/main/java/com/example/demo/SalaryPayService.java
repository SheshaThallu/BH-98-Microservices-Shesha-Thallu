package com.example.demo;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryPayService 
{
	@Autowired
	SalaryPayRepository salaryPayRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	LeavesRepository leavesRepository;
	public List<SalaryPay> getAll() {
		return salaryPayRepository.findAll();
	}
	public SalaryPay saveSalaryPay(SalaryPay salaryPay) {
		Calendar cal = Calendar.getInstance();
		/* set the 1st date of ongoing month */
		cal.set(salaryPay.getYear(), salaryPay.getMonth(), 1);
		Calendar cal1 = Calendar.getInstance();
		/* set the last date of ongoing month */
		cal1.set(salaryPay.getYear(), salaryPay.getMonth(), cal1.getMaximum(Calendar.DAY_OF_MONTH));
		int workingDays = 0;
		/* run the while loop until the months are same */
		while (cal.get(Calendar.MONTH) != cal1.get(Calendar.MONTH)) {
		      if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
		           && cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
		                workingDays++;
		      }
		      cal.add(Calendar.DAY_OF_MONTH, 1);
		}
		Employee employee = employeeRepository.getById(salaryPay.getEmpId());
		Leaves leaves = leavesRepository.findByEmpIdAndYearAndMonth(salaryPay.getEmpId(), salaryPay.getYear(), salaryPay.getMonth());
		if(leaves!=null)
		{
			salaryPay.setSalary( (employee.getSalary() - salaryPay.getDeduction()) - leaves.getNumberOfDays()*employee.getSalary()/workingDays);
		}
		else
		{
			salaryPay.setSalary(employee.getSalary() - salaryPay.getDeduction());
		}
		return salaryPayRepository.save(salaryPay);
	}
	public Optional<SalaryPay> getSalaryPay(Long empId, int year, int month) {
		return salaryPayRepository.findByEmpIdAndYearAndMonth(empId,year,month);
	}
}
