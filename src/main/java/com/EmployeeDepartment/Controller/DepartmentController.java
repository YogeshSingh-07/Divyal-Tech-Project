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
import com.EmployeeDepartment.Service.DepartmentService;



@Controller
public class DepartmentController {
   
	@Autowired
    private DepartmentService departmentService;
    
    @GetMapping("/departments")
    public String getAllDepartments(Model model) {
        List<Department> departments = departmentService.getAllDepartments();
        model.addAttribute("departments", departments);
        return "department-list";
    }
    
    @GetMapping("/departments/add")
    public String showAddDepartmentForm(Model model) {
        model.addAttribute("department", new Department());
        return "department-form";
    }
    
    @PostMapping("/departments/add")
    public String addDepartment(@ModelAttribute("department") Department department) {
        departmentService.saveDepartment(department);
        return "redirect:/departments";
    }
    
    @GetMapping("/departments/edit/{id}")
    public String showEditDepartmentForm(@PathVariable("id") int id, Model model) {
        Department department = departmentService.getDepartmentById(id);
        model.addAttribute("department", department);
        return "department-form";
    }
    
    @PostMapping("/departments/edit/{id}")
    public String updateDepartment(@PathVariable("id") int id, @ModelAttribute("department") Department department) {
        department.setId(id);
        departmentService.saveDepartment(department);
        return "redirect:/departments";
    }
    
    @GetMapping("/departments/delete/{id}")
    public String deleteDepartment(@PathVariable("id") int id) {
        departmentService.deleteDepartment(id);
        return "redirect:/departments";
    }
}
