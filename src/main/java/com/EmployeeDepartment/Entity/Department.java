package com.EmployeeDepartment.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "dept_name")
    private String deptName;
    
    @Column
    private String type;
    
    @Column
    private int active;
    
    @Column(name = "address_block")
    private String addressBlock;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getAddressBlock() {
		return addressBlock;
	}

	public void setAddressBlock(String addressBlock) {
		this.addressBlock = addressBlock;
	}
    
    // Getters and setters
    
}
