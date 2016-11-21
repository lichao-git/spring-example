package com.j2ee.test.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
	
	@Test
	public void test() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml") ;
		SuperPerson superPerson = (SuperPerson) context.getBean("superPerson") ;
		superPerson.superSay() ;
	}

}
