package com.j2ee.test.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Person {

	@Resource
	private Student student ;
	
	public void say() {
		this.student.show() ;
	}
	
}
