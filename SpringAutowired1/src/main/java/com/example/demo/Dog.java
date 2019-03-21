package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Dog implements Animal {

	@Override
	public String sound() {
		return "Barkkkkkk";

	}

}
