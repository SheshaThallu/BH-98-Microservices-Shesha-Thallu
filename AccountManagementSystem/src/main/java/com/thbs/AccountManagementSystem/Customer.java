package com.thbs.AccountManagementSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id @GeneratedValue
	private long id;
	
}
