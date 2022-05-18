package com.app.registration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.registration.Repository.RegistrationRepository;
import com.app.registration.model.User;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository repository;
	
	public User saveUser(User user) {
		
		return repository.save(user);
	}
	
	public User fetchUserByEmailId(String email) {
		return repository.findByEmailId(email);
	}
	public User fetchUserByEmailIdAndPassword(String email,String password) {
		return repository.findByEmailIdAndPassword(email, password);
	}

}
