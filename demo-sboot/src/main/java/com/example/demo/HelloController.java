package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@Autowired
	StudentService studentService;
	
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
	
	
}
