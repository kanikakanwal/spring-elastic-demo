package com.techprimers.elastic.springelasticdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableAutoConfiguration
@RestController
@SpringBootApplication
@ComponentScan({"com.techprimers.elastic"})

public class SpringElasticDemoApplication {

	@RequestMapping("/")
	String home()
	{
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringElasticDemoApplication.class, args);
		
	}
}
