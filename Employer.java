package com.motivity;
import javax.persistence.CascadeType;

//import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;
@Entity
@Table(name="EmployerNew")
public class EmployerNew {
	@Id
	@Column(name="employer_id")
	private int employer_id;
	@Column(name="employer_name")
	private String employer_name;
	@Column(name="department")
	private String department;
	@Column(name="mobile")
	private long mobile;
	@OneToMany(targetEntity=EmployeeNew.class,cascade=CascadeType.ALL,mappedBy="employerNew")
	private List<EmployeeNew> employeeNew;//=new ArrayList<Employee>();
	public int getEmployer_id() {
		return employer_id;
	}
	public void setEmployer_id(int employer_id) {
		this.employer_id = employer_id;
	}
	public String getEmployer_name() {
		return employer_name;
	}
	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String employer_department) {
		this.department = employer_department;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long Mobile) {
		this.mobile = Mobile;
	}
	public List<EmployeeNew> getEmployeeNew() {
		return employeeNew;
	}
	public void setEmployeeNew(List<EmployeeNew> employeeNew) {
		this.employeeNew = employeeNew;
	}

}
