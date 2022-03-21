package com.motivity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table(name="EmployeeNew")
@Entity
public class EmployeeNew {
	@Id
	@Column(name="employee_id")
	private int employee_id;
	@Column(name="employee_name")
	private String employee_name;
	@Column(name="mobile")
	private long mobile;
	@Column(name="Address")
	private String address;
	@ManyToOne
	private EmployerNew employerNew;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public EmployerNew getEmployerNew() {
		return employerNew;
	}
	public void setEmployerNew(EmployerNew employerNew) {
		this.employerNew = employerNew;
	}
}
