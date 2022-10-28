package com.mcb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcb.model.EmployeeEntity;

public interface EmplooyeRepo extends JpaRepository<EmployeeEntity, Integer> {
	EmployeeEntity findByName(String name);

}
