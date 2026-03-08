package com.example.demo.Service;

import com.example.demo.entity.Employee;

public class EmployeeService {
	public String saveEmployeeInDb(Employee e){
		System.out.println(" Employee Data Save in DB");
		return e.getName() + " Employee Added in DB ";
	}
	
	public Employee getEmployeeDataFromDB(){
			Employee e = new Employee();
			 e.setName("Rani");
			 e.setAddress("Latur");
			 e.setEmail("r@gmail.com");
			 e.setAge(25);
			 e.setSal(0);
			 
			 return e;
			 
	}

}
