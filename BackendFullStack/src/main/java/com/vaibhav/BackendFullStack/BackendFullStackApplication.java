package com.vaibhav.BackendFullStack;

import com.vaibhav.BackendFullStack.model.Employee;
import com.vaibhav.BackendFullStack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendFullStackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendFullStackApplication.class, args);
	}


	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setId(1);
//		employee.setFirstName("Vaibhav");
//		employee.setLastName("Chaudhari");
//		employee.setEmailId("chaudharivaibhav908@gmail.com");
//		employeeRepository.save(employee);
//
//
//		Employee employee1 = new Employee();
//		employee1.setId(2);
//		employee1.setFirstName("Pranav");
//		employee1.setLastName("Chaudhari");
//		employee1.setEmailId("pranav12345@gmail.com");
//		employeeRepository.save(employee1);



	}
}
