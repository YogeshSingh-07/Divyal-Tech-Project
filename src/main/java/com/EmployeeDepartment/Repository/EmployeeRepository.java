package com.EmployeeDepartment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EmployeeDepartment.Entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
