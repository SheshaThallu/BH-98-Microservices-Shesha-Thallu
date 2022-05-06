package com.thbs.AccountManagementSystem;

import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController 
{
	
	private final CustomerRepository customerRepository;
	public CustomerController(CustomerRepository customerRepository) 
	{
		this.customerRepository = customerRepository;
	}
	@PostMapping("/login")
	public Optional<Customer> authenticate(@RequestBody Login login) {
		return customerRepository.findByEmailAndPassword(login.getEmail(), login.getPassword());
	}
}
