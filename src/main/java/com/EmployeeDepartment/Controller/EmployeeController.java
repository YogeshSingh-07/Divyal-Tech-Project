package com.EmployeeDepartment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.EmployeeDepartment.Entity.Department;
import com.EmployeeDepartment.Entity.Employee;
import com.EmployeeDepartment.Service.DepartmentService;
import com.EmployeeDepartment.Service.EmployeeService;

@Controller
public class EmployeeController {
	
	
    @Autowired
    private EmployeeService employeeService;
    
    @Autowired
    private DepartmentService departmentService;
    
    
    
    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employee-list";
    }
    
    @GetMapping("/employees/add")
    public String showAddEmployeeForm(Model model) {
        List<Department> departments = departmentService.getAllDepartments();
        model.addAttribute("departments", departments);
        model.addAttribute("employee", new Employee());
        return "employee-form";
    }
    
    @PostMapping("/employees/add")
    public String addEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }
    
    @GetMapping("/employees/edit/{id}")
    public String showEditEmployeeForm(@PathVariable("id") int id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        List<Department> departments = departmentService.getAllDepartments();
        model.addAttribute("employee", employee);
        model.addAttribute("departments", departments);
        return "employee-form";
    }
    
    @PostMapping("/employees/edit/{id}")
    public String updateEmployee(@PathVariable("id") int id, @ModelAttribute("employee") Employee employee) {
        employee.setId(id);
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }
    
    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }
}

