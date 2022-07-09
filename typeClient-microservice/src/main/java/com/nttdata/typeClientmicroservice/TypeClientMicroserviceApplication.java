package com.nttdata.typeClientmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TypeClientMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TypeClientMicroserviceApplication.class, args);
	}

}
