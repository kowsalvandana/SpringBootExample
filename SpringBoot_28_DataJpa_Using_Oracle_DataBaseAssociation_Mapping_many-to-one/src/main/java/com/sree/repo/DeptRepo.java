package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Dept;

public interface DeptRepo extends JpaRepository<Dept,Integer>{

}
