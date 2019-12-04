package com.demospringdto;

public class EmployeeDetails {

	private int empId;
	private String empName;
	private String deptName;
	
	
	
	public EmployeeDetails() {
		
	}
	public EmployeeDetails(int empId, String empName, String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
