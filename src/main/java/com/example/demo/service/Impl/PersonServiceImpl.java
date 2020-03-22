package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.entities.PersonBean;
import com.example.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public PersonBean persionXx() {
		PersonBean personBean  = new PersonBean("周芷若", 18, "zzr@163.com");
		return personBean;
	}

}
