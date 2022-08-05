package com.wipro.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.model.BankDetail;
import com.wipro.model.PensionStatement;
import com.wipro.repository.BankDetailRepository;

@Service
public class BankDetailService {

	private BankDetailRepository repository;
	

	@Autowired
	public BankDetailService(BankDetailRepository repository) {

		this.repository = repository;
	}

	public BankDetail findAccount(String id) throws Exception{
		BankDetail detail = repository.findById(id).get();
		return detail;
	}
	
	public Boolean saveAccount(BankDetail detail) throws Exception{
		repository.save(detail);
		return true;
	}
	
	public PensionStatement getStatement(String id) throws Exception{
		PensionStatement statement = new PensionStatement();
		BankDetail detail = repository.findById(id).get();
		statement.setAccountNumber(detail.getAccountNumber());
		statement.setAccountType(detail.getAccountType());
		statement.setBalance(detail.getNetSalary());
		statement.setFullName(detail.getAccountHolderName());
		return statement;
	}
}
