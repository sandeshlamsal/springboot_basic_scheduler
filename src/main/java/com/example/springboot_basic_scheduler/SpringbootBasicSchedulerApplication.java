package com.example.springboot_basic_scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootBasicSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBasicSchedulerApplication.class, args);
	}

}
