package com.bootcamp.msSavingAccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsSavingAccountBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSavingAccountBankApplication.class, args);
	}

}
