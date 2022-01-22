package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class Demo2Application {

	RestTemplate restTemplate;
	public Demo2Application(RestTemplateBuilder restTemplate){
		this.restTemplate = restTemplate.build();
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	@GetMapping("/demo2")
	public String demo1(){
		restTemplate.getForObject("http://localhost:8080/demo1", String.class);
		return "demo2";
	}
}
