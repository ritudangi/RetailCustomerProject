package com.retailmanager.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * Main class to launch sprint boot application
 */
@ComponentScan({ "com.retailmanager.*" })
@SpringBootApplication
public class RetailManagerLauncher {
	public static void main(String[] args) {
		SpringApplication.run(RetailManagerLauncher.class, args);
	}
}