package com.vaibhav.BackendFullStack.repository;

import com.vaibhav.BackendFullStack.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // All crud database methods
}
