package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonBean {
	private String name;
	private int age;
	private String mail; 
}
