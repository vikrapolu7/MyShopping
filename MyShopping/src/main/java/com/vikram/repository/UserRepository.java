package com.vikram.repository;

import org.springframework.data.repository.CrudRepository;

import com.vikram.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public User findByEmailIdAndPassword(String emailId, String password);
}
