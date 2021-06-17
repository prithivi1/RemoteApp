package com.remote;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.remote"})
public class RemoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteApplication.class, args);
	}
}
