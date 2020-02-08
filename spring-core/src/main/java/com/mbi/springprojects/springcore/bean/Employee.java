package com.mbi.springprojects.springcore.bean;

public class Employee {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello! " + name;
	}
}
