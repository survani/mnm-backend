package com.mythsnomore.MythsNoMore;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class MythsNoMoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MythsNoMoreApplication.class, args);
	}

}
