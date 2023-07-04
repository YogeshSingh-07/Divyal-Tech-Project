package com.EmployeeDepartment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EmployeeDepartment.Entity.Department;



public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}

