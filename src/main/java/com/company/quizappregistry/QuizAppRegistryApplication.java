package com.company.quizappregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuizAppRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAppRegistryApplication.class, args);
	}

}
