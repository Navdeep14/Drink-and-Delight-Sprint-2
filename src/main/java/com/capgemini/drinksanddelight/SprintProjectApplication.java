package com.capgemini.drinksanddelight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

/*
@author NAVDEEP TRIPATHI
*/

@SpringBootApplication
@EnableTransactionManagement
public class SprintProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintProjectApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
}
