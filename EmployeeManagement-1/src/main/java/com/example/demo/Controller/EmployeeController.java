package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.entity.Employee;

@RestController
public class EmployeeController {
	
	@PostMapping("addEmpl")
	String addEmployee(@RequestBody Employee e){
		EmployeeService es = new EmployeeService();
		string msg = es.saveEmployeeInDb(e);
		return msg;
		
	}
	
	@GetMapping("getEmpl")
	Employee getEmployee() {
		EmployeeService es = new EmployeeService();
		    return   es.getEmployeeDataFromDB();
		
	}

}
