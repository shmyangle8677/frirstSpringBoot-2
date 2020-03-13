package com.example.demo;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.example.demo.websevice.serviceImp.HelloImp;

@SpringBootApplication
public class FrirstSpringBoot2Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FrirstSpringBoot2Application.class, args);
		
		String address="http://localhost:8081/ws";
		Endpoint.publish(address, new HelloImp());
		System.out.println("ws 启动成功……");
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(FrirstSpringBoot2Application.class);
	}

}
