package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController 
{
	@Autowired
	private LoginService loginService;
	@GetMapping("/login/{userName}/{password}")
	Login authenticate(@PathVariable String userName,@PathVariable String password)
	{
		return loginService.autenticate(userName,password);
	}
}
