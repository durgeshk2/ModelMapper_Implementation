package com.cetpa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeServiceDtoModelmapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceDtoModelmapperApplication.class, args);
	}
	@Bean
	ModelMapper getMapper()
	{
		return new ModelMapper();
	}

}
