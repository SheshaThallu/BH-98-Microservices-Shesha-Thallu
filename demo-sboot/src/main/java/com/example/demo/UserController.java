package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController 
{
	private final UserRepository userRepository;
	
	public UserController(UserRepository userRepository) 
	{
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	List<User> getAll()
	{
		return userRepository.findAll();
	}
}
