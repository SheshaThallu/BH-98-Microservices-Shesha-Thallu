package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@RequestMapping("/")
	@ResponseBody
	String hello()
	{
		return "Hello From My Soring Boot Application";
	}
	
	@RequestMapping("/{firstNumber}/{secondNumber}")
	String calculator(@PathVariable Long firstNumber,@PathVariable Long secondNumber)
	{
		return "Addition "+(firstNumber+secondNumber)+" Subtraction "+(firstNumber-secondNumber)+" Multiplication "+(firstNumber*secondNumber)+" Division "+(firstNumber/secondNumber);
	}
	
	@RequestMapping("/student/{name}/{marks}")
	String studentInfo(@PathVariable String name,@PathVariable Long marks)
	{
		Student student = new Student(marks, name);
		return student.getGrade();
	}
}
