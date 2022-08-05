package com.wipro.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.exception.ResourceNotFoundException;
import com.wipro.model.PersonalDetail;
import com.wipro.repository.PensionerDetailRepository;
import com.wipro.service.PensionarDetailServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PensionerDetailsController {

	PensionarDetailServiceImpl service;
	@Autowired
	public PensionerDetailsController(PensionarDetailServiceImpl pensionarDetailServiceImpl) {
		this.service = pensionarDetailServiceImpl;
	}

	//authorizing end point with jwt token 
	
	//Returning pensioner detail for provided aadhaar number 
	
	@GetMapping("/user/getPersonalDetails/{id}")
	public ResponseEntity<?> getPersonalDetails(@PathVariable String id) throws Exception {
		try{
			PersonalDetail detail = service.findUser(id);
			return new ResponseEntity<>(detail,HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/user/updatePersonalDetail/{id}")
	public ResponseEntity<?> updatePersonalDetails(@RequestBody PersonalDetail detail) throws Exception {
		try{
			service.saveUser(detail);
			return new ResponseEntity<>(detail,HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/")
	public String hello() {
		return "Pensioner Details Microservice Working";
	}
	
	

}
