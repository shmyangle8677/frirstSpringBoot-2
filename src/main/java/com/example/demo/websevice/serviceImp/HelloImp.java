package com.example.demo.websevice.serviceImp;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jws.WebService;
import com.example.demo.websevice.service.Hello;

@WebService
public class HelloImp implements Hello {

	@Override
	public String sayHello(String name) {
		return new SimpleDateFormat("yyyyMMdd").format(new Date())+":你好，我是"+name;
	}

}
