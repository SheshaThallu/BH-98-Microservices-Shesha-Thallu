package com.thbs.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.hrms.entity.Login;
import com.thbs.hrms.service.LoginService;

@RestController
@CrossOrigin(origins = "http://13.126.212.194")
public class LoginController 
{
	@Autowired
	private LoginService loginService;
	@GetMapping("/login/{userName}/{password}")
	Login authenticate(@PathVariable String userName,@PathVariable String password)
	{
		return loginService.autenticate(userName,password);
	}
	@PostMapping("/login")
	Login saveLogin(@RequestBody Login login)
	{
		return loginService.save(login);
	}
}
