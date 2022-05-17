package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeavesService 
{
	@Autowired
	LeavesRepository leavesRepository;

	public List<Leaves> getAll() {
		return leavesRepository.findAll();
	}

	public Leaves saveLeaves(Leaves leaves) {
		Leaves leave = leavesRepository.findByEmpIdAndYearAndMonth(leaves.getEmpId(),leaves.getYear(),leaves.getMonth());
		if(leave!=null) 
		{
			leave.setNumberOfDays(leave.getNumberOfDays()+leaves.getNumberOfDays());
			return leavesRepository.save(leave);
		}
		return leavesRepository.save(leaves);
	}

	public Leaves getLeaves(Long empId,int year,int month) {
		if(leavesRepository.findByEmpIdAndYearAndMonth(empId, year, month)==null)
		{
			Leaves leaves = new Leaves();
			leaves.setEmpId(empId);
			leaves.setYear(year);
			leaves.setMonth(month);
			leaves.setNumberOfDays((long) 0);
			leavesRepository.save(leaves);
			return leaves;
		}
		else
			return leavesRepository.findByEmpIdAndYearAndMonth(empId, year, month);
	}
}