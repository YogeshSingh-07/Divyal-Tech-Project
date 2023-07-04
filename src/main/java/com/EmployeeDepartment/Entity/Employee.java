package com.EmployeeDepartment.Entity;

import java.util.*;

import org.springframework.format.annotation.DateTimeFormat;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	    
	    @Column(name = "emp_name")
	    private String empName;
	    
	    @Column
	    private String address;
	    
	    @Column
	    private String mobile;
	    
	    @Column
	    private String email;
	    
	    
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date dob;
	    
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date doj;
	    
	    @Column
	    private String gender;
	    
	    @Column
	    private int active;
	    
	    @ManyToOne
	    @JoinColumn(name = "dept_id")
	    private Department department;

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public Date getDoj() {
			return doj;
		}

		public void setDoj(Date doj) {
			this.doj = doj;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public int getActive() {
			return active;
		}

		public void setActive(int active) {
			this.active = active;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", empName=" + empName + ", address=" + address + ", mobile=" + mobile
					+ ", email=" + email + ", dob=" + dob + ", doj=" + doj + ", gender=" + gender + ", active=" + active
					+ ", department=" + department + "]";
		}

		
		
	}

