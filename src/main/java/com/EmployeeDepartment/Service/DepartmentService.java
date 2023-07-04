package com.EmployeeDepartment.Service;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.EmployeeDepartment.Entity.Department;
import com.EmployeeDepartment.Repository.DepartmentRepository;



@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    
    public void saveDepartment(Department department) {
        departmentRepository.save(department);
    }
    
    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Department not found"));
    }
    
    public void deleteDepartment(int id) {
        departmentRepository.deleteById(id);
    }
}
