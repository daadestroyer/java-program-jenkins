package com.thecoderstv.jenkins_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JenkinsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsExampleApplication.class, args);
		System.out.println("-----------------------------");
		System.out.println("This is java program");
		System.out.println("Output from java program");
		System.out.println("Current Date :  "+new Date(2025, 4, 8));
		System.out.println("This is change 2");
		System.out.println("This is change 3");

		System.out.println("20 Apr 2025");
		System.out.println("20 Apr 2025");
//		System.out.println(10/0);
//		System.out.println(10/0);
		System.out.println("-----------------------------");
	}

}
