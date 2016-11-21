package com.j2ee.test.annotation;

import org.springframework.stereotype.Component;

@Component
public class SuperPerson extends Person{

	public void superSay() {
		this.say() ;
	}
	
	
}
