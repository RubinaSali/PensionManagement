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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.model.BankDetail;
import com.wipro.model.PensionStatement;
import com.wipro.service.BankDetailService;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "http://localhost:4200")
public class BankDetailController {

	private BankDetailService service;

	@Autowired
	public BankDetailController(BankDetailService service) {

		this.service = service;
	}

	@GetMapping("/user/getAccountDetail/{id}")
	public ResponseEntity<?> getAccountDetail(@PathVariable String id) throws Exception {
		try{
			BankDetail detail = service.findAccount(id);
			return new ResponseEntity<>(detail,HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/user/updateAccountDetail")
	public ResponseEntity<?> updatePersonalDetails(@RequestBody BankDetail detail) throws Exception {
		try{
			service.saveAccount(detail);
			return new ResponseEntity<>(detail,HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/account/getAccountStatement/{id}")
	public ResponseEntity<?> getAccountStatement(@PathVariable String id) throws Exception {
		try{
			PensionStatement detail = service.getStatement(id);
			return new ResponseEntity<>(detail,HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("/account/getPensionStatement/{id}")
	public ResponseEntity<?> getPensionStatement(@PathVariable String id) throws Exception {
		try{
			PensionStatement detail = service.getStatement(id);
			return new ResponseEntity<>(detail,HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("/h")
	public String hello() {
		return "Pensioner Disbursement Microservice";
	}

}
