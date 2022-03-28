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
	public Long saveLicHolders(Lic l) {
		
		return repo.save(l).getPolicynumber();
	}

	@Override
	public List<Lic> getAllLicHolders() {
	
		return repo.findAll();
	}

	

	@Override
	public Lic getOneLicHolders(Long policynumber) {
		
		return repo.getLicByPolicynumber(policynumber);
				
	}

	@Override
	public void deleteLicHolder(Long policynumber) {
		repo.deleteById(policynumber);
		
	}

	@Override
	public void updateLicHolders(Lic l) {
		repo.save(l);
		
	}
	

}
