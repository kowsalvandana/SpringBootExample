package com.sree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.Lic;
import com.sree.repo.LicRepo;

@Service
public class LicServiceImpl implements LicService {

	@Autowired
	private LicRepo repo;
	
	@Override
	public Lic getOneLicHolders(Long sid) {
		
		return repo.getLicByPolicynumber(sid);
				
	}
	

}
