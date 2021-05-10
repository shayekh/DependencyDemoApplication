package com.di.example.DependencyDemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.security.auth.login.Configuration;

@SpringBootApplication
public class DependencyDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DependencyDemoApplication.class, args);
		Customers c=context.getBean(Customers.class);
		c.display();
	}

}
