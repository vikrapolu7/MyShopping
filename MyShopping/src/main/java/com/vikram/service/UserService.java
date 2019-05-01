package com.vikram.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.vikram.model.Product;
import com.vikram.model.User;
import com.vikram.repository.UserRepository;

@Service
@Transactional
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	public void registerUser(User user) {
		
		userRepository.save(user);
	}
	
	public User findByEmailIdAndPassword(String emailId, String password) {
		// TODO Auto-generated method stub
		return userRepository.findByEmailIdAndPassword(emailId, password);
		
	}
	
}
