package com.sree.service;

import java.util.List;
import java.util.Optional;

import com.sree.model.Lic;

public interface LicService {
	public Long saveLicHolders(Lic l);	
	public List<Lic> getAllLicHolders();
	public Lic getOneLicHolders(Long policynumber);
	public void deleteLicHolder(Long policynumber);
	public void updateLicHolders(Lic l);

}
