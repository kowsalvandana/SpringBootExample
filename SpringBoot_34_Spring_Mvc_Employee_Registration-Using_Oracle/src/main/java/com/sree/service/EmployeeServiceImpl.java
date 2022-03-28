package com.sree.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.Employee;
import com.sree.repo.EmployeeRepository;



@Service // calculations + sorting + AutoTx Management
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;

	
		@Override
		public Integer saveEmployee(Employee e) {
			//JDK 10- var - local variable type inference

			//cal hra,ta
			/*var sal = e.getSal();
			var hra = sal * 10/100.0;
			var ta = sal * 6/100.0;

			e.setHra(hra);
			e.setTa(ta);*/

			return repo.save(e).getId();
		}

		@Override
		public void updateEmployee(Employee e) {
			//cal hra,ta
			/*var sal = e.getSal();
			var hra = sal * 10/100.0;
			var ta = sal * 6/100.0;

			e.setHra(hra);
			e.setTa(ta);*/
			repo.save(e);
		}



		@Override
		public void deleteEmployee(Integer id) {
			repo.deleteById(id);
		}

		@Override
		public Optional<Employee> getOneEmployee(Integer id) {
			return repo.findById(id);
		}

		@Override
		public List<Employee> getAllEmployees() {
			List<Employee> list = repo.findAll();
			//JDK 1.8 List Sort (using Comparator)
			list.sort((ob1,ob2)->ob1.getId()-ob2.getId());
			return list;
		}

		@Override
		public boolean isEmployeeExist(Integer id) {
			return repo.existsById(id);
		}

		
	}
