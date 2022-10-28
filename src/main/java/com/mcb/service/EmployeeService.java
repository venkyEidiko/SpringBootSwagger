package com.mcb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcb.model.EmployeeEntity;
import com.mcb.model.Response;
import com.mcb.repo.EmplooyeRepo;

@Service
public class EmployeeService {
	@Autowired
	public EmplooyeRepo repository;
	
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		return repository.save(employeeEntity);
	}


	public List<EmployeeEntity> getEmployees() {
		return repository.findAll();
	}

	public EmployeeEntity getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}

	public EmployeeEntity getEmployeeByName(String name) {
		return repository.findByName(name);
	}

	public String deleteById(int id) {
		repository.deleteById(id);
		return "Employee " + id + " has deleted successfully";
	}

	public Response updateEmployee(EmployeeEntity employeeEntity) {
		Response response = new Response();
		EmployeeEntity exestingRecord = repository.findById(employeeEntity.getId()).orElse(null);
		if(exestingRecord != null) {
		exestingRecord.setName(employeeEntity.getName());
		exestingRecord.setMailId(employeeEntity.getMailId());
		exestingRecord.setDept(employeeEntity.getDept());
		exestingRecord.setDateOfBirth(employeeEntity.getDateOfBirth());
		exestingRecord.setAddress(employeeEntity.getAddress());
		exestingRecord.setSalary(employeeEntity.getSalary());

		 repository.save(exestingRecord);
		 response.setMassage("Data has Updated");
		 response.setSatus(200);
		 
		 return response;
		 
		

	}
		 response.setMassage("Data has not Updated");
		 response.setSatus(400);
		 
		 return response;
	

	}

}
