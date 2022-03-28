package com.sree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.Student;
import com.sree.repo.LicRepo;


@Service
public class LicServiceImpl implements LicService {

	@Autowired
	private LicRepo repo;

	@Override
	public Student getOneLicHolders(Integer sid) {
	
		return repo.getLicByPolicynumber(sid);
	}
	
	
	

}
