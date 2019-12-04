package com.demospring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demospringdto.EmployeeDetails;

@Service
public class EmployeeDetailsServiceImp implements EmployeeDetailsService {

	List<EmployeeDetails> empList =new ArrayList<>( Arrays.asList(new EmployeeDetails(1,"Ashmita","LRP"),
			new EmployeeDetails(2,"Ashmita","LRP"),new EmployeeDetails(3,"Ashmita","LRP")));
	
			public List<EmployeeDetails> getEmployee() {
		return empList;
	}

	@Override
	public EmployeeDetails getEmployeeId(int empId) {
		
		return empList.stream().filter(e ->e.getEmpId()== empId).findFirst().get();
	}

	@Override
	public void addEmployee(EmployeeDetails employee) {
		
		empList.add(employee);
	}

	@Override
	public void updateEmployee(EmployeeDetails employee , int id) {
		
		for(int i=0;i<empList.size();i++) {
			
			EmployeeDetails e =empList.get(i);
			if(e.getEmpId() ==id) {
				empList.set(i, employee);
				return;
			}
		
		}
		
	}

	@Override
	public void deleteEmployee(int id) {

		
				empList.remove(id);
			
		
		
	}

}
