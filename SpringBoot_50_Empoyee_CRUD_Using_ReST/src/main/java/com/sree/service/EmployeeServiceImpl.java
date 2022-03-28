package com.sree.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.Employee;
import com.sree.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeRepo repo;
	@Override
	public Integer saveStudent(Employee e) {
		
		return repo.save(e).getEid();
	}

	@Override
	public void updateStudent(Employee e) {
		repo.save(e);
	}

	@Override
	public void deleteStudent(Integer eid) {
		repo.deleteById(eid);
	}

	@Override
	public Optional<Employee> getOneStudent(Integer eid) {
		
		return repo.findById(eid);
	}

	@Override
	public List<Employee> findAllStudents() {
		
		return repo.findAll();
	}

	@Override
	public boolean isPresent(Integer eid) {
		
		return repo.existsById(eid);
		}

}
