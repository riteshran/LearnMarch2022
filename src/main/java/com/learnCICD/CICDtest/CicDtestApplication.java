package com.learnCICD.CICDtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicDtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicDtestApplication.class, args);
		System.out.println("Learning CICD --Continues Integration and Continues Deployment");
	}

}
