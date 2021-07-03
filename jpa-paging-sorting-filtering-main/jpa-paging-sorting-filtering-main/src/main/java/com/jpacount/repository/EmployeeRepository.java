package com.jpacount.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpacount.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
