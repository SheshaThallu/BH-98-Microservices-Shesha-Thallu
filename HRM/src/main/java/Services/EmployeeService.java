package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entities.Employee;
import Repositories.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	
}
