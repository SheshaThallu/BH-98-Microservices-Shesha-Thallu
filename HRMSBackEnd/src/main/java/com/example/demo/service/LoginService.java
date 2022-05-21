package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginService 
{
	@Autowired
	private LoginRepository loginRepository;
	public Login autenticate(String userName,String password) {
		return loginRepository.findByUserNameAndPassword(userName,password);
	}
	
}
