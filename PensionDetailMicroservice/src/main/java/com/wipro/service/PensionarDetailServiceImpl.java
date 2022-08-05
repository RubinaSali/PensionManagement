package com.wipro.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.exception.ResourceNotFoundException;
import com.wipro.model.PersonalDetail;
import com.wipro.repository.PensionerDetailRepository;

@Service
public class PensionarDetailServiceImpl{
	
	private PensionerDetailRepository pensionerDetailRepository;

	@Autowired
	public PensionarDetailServiceImpl(PensionerDetailRepository pensionerDetailRepository) {

		this.pensionerDetailRepository = pensionerDetailRepository;
	}

	public PersonalDetail findUser(String id) throws Exception{
		PersonalDetail detail = pensionerDetailRepository.findById(id).get();
		return detail;
	}
	
	public Boolean saveUser(PersonalDetail detail) throws Exception{
		pensionerDetailRepository.save(detail);
		return true;
	}
}
