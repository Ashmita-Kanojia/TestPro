package com.demospring.service;

import java.util.List;

import com.demospringdto.EmployeeDetails;

public interface EmployeeDetailsService {
	
	public List<EmployeeDetails> getEmployee();
	
	public EmployeeDetails getEmployeeId(int empId);

	public void addEmployee(EmployeeDetails employee);
	
	public void updateEmployee(EmployeeDetails employee,int id);
	
	public void deleteEmployee(int id);

}
