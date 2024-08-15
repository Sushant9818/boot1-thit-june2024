package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.EmployeeEntity;

public interface EmployeeRepository  extends JpaRepository<EmployeeEntity, Integer>{

	 EmployeeEntity findByEmailAndPassword(String email, String password);//derived query
	 Optional<EmployeeEntity> findByEmail(String email);//derived query

}
