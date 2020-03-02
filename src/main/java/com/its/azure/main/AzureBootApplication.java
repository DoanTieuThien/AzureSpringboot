package com.its.azure.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author itshare
 *
 */

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.its.*")
public class AzureBootApplication {
	public static void main(String[] args) {
		System.setProperty("javax.net.ssl.trustStore","azure.jks");
		System.setProperty("javax.net.ssl.trustStorePassword","its@123");
		SpringApplication.run(AzureBootApplication.class, "");
	}
}
