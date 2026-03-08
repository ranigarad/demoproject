package com.example.demo.entity;

public class Employee {
	private String name;
	private String address;
	private String email;
	private int age;
	private int sal;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setSal(int sal) {
		this.sal=sal;
	}
	public String getName()
	{
		return name;
	}	
	public String getAddress(){
		return address;
	}
	public String getEmail(){
		return email;
	}
	public int getAge(){
		return age;
	}
	public int getSal(){
		return sal;
	} }
