package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	private final StudentRepository studentRepository;
	public StudentController(StudentRepository studentRepository) 
	{
		this.studentRepository = studentRepository;
	}
	
	@GetMapping("/students")
	List<Student> getAll()
	{
		return studentRepository.findAll();
	}
	
	@GetMapping("/student/{id}")
	String getOne(@PathVariable Long id)
	{
		return studentService.getGrade(studentRepository.getById(id));
	}
}
