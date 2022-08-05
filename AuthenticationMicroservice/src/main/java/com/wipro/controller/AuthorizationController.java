package com.wipro.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.model.AuthRequest;
import com.wipro.model.UserRegister;
import com.wipro.service.CustomUserDetailService;


@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthorizationController {
	private CustomUserDetailService userDetailService;


	
	@Autowired
	public AuthorizationController(CustomUserDetailService userDetailService) {
		this.userDetailService = userDetailService;
		
	}

	//starting message 
	
	@GetMapping
	public ResponseEntity<String> welcome() {
		return ResponseEntity.ok("Wecome to security application");
	}

	//jwt token authentication using user name and password
	
	@PostMapping("/login")
	public ResponseEntity<?> register(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			userDetailService.findUser(authRequest);
			return new ResponseEntity<>(authRequest,HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
		}
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody UserRegister user) throws Exception {
		try {
			userDetailService.saveUser(user);
			return new ResponseEntity<>(user,HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
		}
	}
	

}
