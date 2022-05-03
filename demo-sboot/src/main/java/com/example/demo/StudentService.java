package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
	@Autowired
	StudentRepository studentRepository;
	
	public Student saveStudent(Student student)
	{
		if(student.getMarks()>100)
			student.setGrade("Invalid");
		else if(student.getMarks()>=90)
			student.setGrade("A");
		else if(student.getMarks()>=80)
			student.setGrade("B");
		else if(student.getMarks()>=70)
			student.setGrade("C");
		else
			student.setGrade("Fail");
		return studentRepository.save(student);
	}
	public void deleteStudent(Long id) 
	{
		studentRepository.deleteById(id);
	}
	public Optional<Student> getOneStudent(Long id) {

		return studentRepository.findById(id);
	}
}
