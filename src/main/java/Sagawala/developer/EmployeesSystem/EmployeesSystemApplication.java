package Sagawala.developer.EmployeesSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Sagawala.developer.EmployeesSystem")
public class EmployeesSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesSystemApplication.class, args);
	}

}
