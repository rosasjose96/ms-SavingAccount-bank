package com.bootcamp.msSavingAccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * The type Ms saving account bank application.
 */
@EnableEurekaClient
@SpringBootApplication
public class MsSavingAccountBankApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
		SpringApplication.run(MsSavingAccountBankApplication.class, args);
	}

}
