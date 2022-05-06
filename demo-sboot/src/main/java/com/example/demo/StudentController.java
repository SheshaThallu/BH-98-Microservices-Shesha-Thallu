package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	private final StudentRepository studentRepository;
	public StudentController(StudentRepository studentRepository) 
	{
		this.studentRepository = studentRepository;
	}
	@PostMapping("/student")
	Student save(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/students")
	List<Student> getAll()
	{
		return studentRepository.findAll();
	}
	
	@GetMapping("/student/{id}")
	Optional<Student> getOneStudent(@PathVariable Long id)
	{
		return studentService.getOneStudent(id);
	}
	
	@DeleteMapping("/student/{id}")
	void deleteOneStudent(@PathVariable Long id)
	{
		studentService.deleteStudent(id);
	}
	
	@PutMapping("/student/{id}")
	Student updateStudent(@PathVariable Long id,@RequestBody Student st)
	{
		return studentRepository.findById(id).map(
				student -> {
					student.setName(st.getName());
					return studentRepository.save(student);
				}).orElseGet(
				() -> {
					st.setId(id);
					st.setMarks(90);
					return studentService.saveStudent(st);
				});
	}
}
