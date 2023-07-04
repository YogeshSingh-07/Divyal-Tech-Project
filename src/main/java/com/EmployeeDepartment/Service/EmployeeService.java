package com.EmployeeDepartment.Service;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.EmployeeDepartment.Entity.Employee;
import com.EmployeeDepartment.Repository.EmployeeRepository;


@Service
public class EmployeeService {
	
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Employee not found"));
    }
    
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
