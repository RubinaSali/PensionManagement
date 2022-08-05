package com.wipro.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.model.AuthRequest;
import com.wipro.model.UserRegister;
import com.wipro.repository.UserRepository;

@Service
public class CustomUserDetailService{

	private UserRepository userRepository;

	@Autowired
	public CustomUserDetailService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public boolean saveUser(UserRegister user) throws Exception {
		userRepository.save(user);
		return true;
	}
	
	public boolean findUser(AuthRequest authRequest) throws Exception {
		UserRegister user = userRepository.findByUserNameAndPassword(authRequest.getUserName(), authRequest.getPassword());
		if(user!=null) {
			return true;
		}
		throw new Exception("Invalid Credentials");
	}
	
	

}
