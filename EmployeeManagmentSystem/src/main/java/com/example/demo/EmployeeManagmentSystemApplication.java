package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagmentSystemApplication implements CommandLineRunner {
	
	private final EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeManagmentSystemApplication(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagmentSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		if(employeeRepo.findAll().isEmpty()) {
			employeeRepo.save(new Employee("nilesh" , "it" , "analyst"));
		}
		
		for(Employee employee:employeeRepo.findAll()) {
			System.out.println(employee);
		}
		
	}

}
