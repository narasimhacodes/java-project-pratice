package com.example.JavaLabSpring;

import com.example.JavaLabSpring.Entity.StudentEntity;
import com.example.JavaLabSpring.RepositaryInterface.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class JavaLabSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaLabSpringApplication.class, args);


	}

}
