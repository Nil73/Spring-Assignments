package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	
	
	private String ename;
	private String edepartment;
	private String edesignation;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee( String ename, String edepartment, String edesignation) {
		super();
		
		this.ename = ename;
		this.edepartment = edepartment;
		this.edesignation = edesignation;
		
	}


	

	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEdepartment() {
		return edepartment;
	}


	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}


	public String getEdesignation() {
		return edesignation;
	}


	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}


	


	@Override
	public String toString() {
		return "Employee [ ename=" + ename + ", edepartment=" + edepartment + ", edesignation="
				+ edesignation + "]";
	}
	
	
	

}
