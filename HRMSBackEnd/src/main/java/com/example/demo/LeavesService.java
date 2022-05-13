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
		Leaves leave = leavesRepository.findByEmpIdAndYear(leaves.getEmpId(),leaves.getYear());
		if(leave!=null && leave.getMonth().equals(leaves.getMonth())) 
		{
			leave.setNumberOfDays(leave.getNumberOfDays()+leaves.getNumberOfDays());
			return leavesRepository.save(leave);
		}
		return leavesRepository.save(leaves);
	}

	
}