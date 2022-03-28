package com.sree.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Lic;

public interface LicRepo extends JpaRepository<Lic,Long> {

Lic getLicByPolicynumber(Long policynumber);
}
