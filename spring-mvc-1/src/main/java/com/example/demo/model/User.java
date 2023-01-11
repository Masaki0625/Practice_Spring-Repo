package com.example.demo.model;

public class User {
	private String name;
	private String email;
	private Integer age;
	
	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
}
