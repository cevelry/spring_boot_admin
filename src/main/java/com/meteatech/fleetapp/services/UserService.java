package com.meteatech.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.meteatech.fleetapp.models.User;
import com.meteatech.fleetapp.repository.UserRepository;

@Service
public class UserService {

	@Autowired private BCryptPasswordEncoder encoder;
	
	
	@Autowired
	private UserRepository userRepository;
	

	public void save(User user) {
		
		user.setPassword(encoder.encode(user.getPassword()));
		
		userRepository.save(user);
	}
	
	//Get All Users
	public List<User> findAll(){
		return userRepository.findAll();
	}	
	
	//Get User By Id
	public Optional<User> findById(int id) {
		return userRepository.findById(id);
	}	
	
	//Delete User
	public void delete(int id) {
		userRepository.deleteById(id);
	}
	
	
}
