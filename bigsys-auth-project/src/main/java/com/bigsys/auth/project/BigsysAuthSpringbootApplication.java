package com.bigsys.auth.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = "com.bigsys.auth.project")
@MapperScan(basePackages = "com.bigsys.auth.project.db.**")
public class BigsysAuthSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigsysAuthSpringbootApplication.class, args);
	}
}
