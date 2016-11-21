package com.j2ee.test.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	@Test
	public void test() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml") ;
		Person person = (Person) context.getBean("person") ;
		person.say() ;
	}
	
	
}
