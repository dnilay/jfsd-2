package net.guides.springboot2.springboot2jpacrudexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	private EmployeeRepository employeeRepository;
	@Autowired
	public Application(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.save(new Employee("John", "Doe", "john@email.com"));
		employeeRepository.save(new Employee("Marry", "Public", "marry@email.com"));
		
	}
}
