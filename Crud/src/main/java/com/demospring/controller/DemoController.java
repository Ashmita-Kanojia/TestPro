package com.demospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demospring.service.EmployeeDetailsService;
import com.demospringdto.EmployeeDetails;

@RestController
public class DemoController {

	@Autowired
	EmployeeDetailsService emp;
	@RequestMapping("/welcome")
	public String welcome() {

		System.out.println("Hello");
		return "Hello";
	}
	@RequestMapping("/getemployee")
	public List<EmployeeDetails> getEmployeeDetails(){
		
		return emp.getEmployee();
	}
	
	@RequestMapping("/id/{id}")
	public EmployeeDetails getEmployeeId(@PathVariable int id)
	{
		return emp.getEmployeeId(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addEmployee")
	public void addEmployee(@RequestBody EmployeeDetails employee) {
		emp.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updateEmployee/{id}")
	public void updateEmployee(@RequestBody EmployeeDetails employee , @PathVariable int id) {
		emp.updateEmployee(employee,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteEmployee/{id}")
	public void deleteEmployee( @PathVariable int id) {
		emp.deleteEmployee(id);
	}

}
