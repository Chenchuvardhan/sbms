package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	System.out.println(context.getClass().getName());
	System.out.println(context.getBeanDefinitionCount());
	}
}
