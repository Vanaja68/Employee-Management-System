package edu.pace.obs1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pace.obs1.model.Employee;


@Repository
public interface EmployeeRepository 
extends JpaRepository<Employee, Long>{

}