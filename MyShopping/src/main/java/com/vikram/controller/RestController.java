package com.vikram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vikram.model.User;
import com.vikram.service.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private UserService userService;

	
	  @GetMapping("/") 
	  public String hello() { return "Hello"; }
	  
	  @GetMapping("/register-user") 
	  public String registerUser(@RequestParam String
	  firstName,@RequestParam String lastName,@RequestParam String
	  emailId,@RequestParam String password,@RequestParam String
	  phoneNumber,@RequestParam String address) 
	  { User user=new
	  User(firstName,lastName,emailId,password,phoneNumber,address);
	  userService.registerUser(user); return "login"; }
	 
}
