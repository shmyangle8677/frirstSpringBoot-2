package com.example.demo.websevice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Hello {
	@WebMethod
	String sayHello(String name);
}
