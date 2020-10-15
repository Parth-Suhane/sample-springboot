package com.sai.sai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.sai.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
