package com.niloy.spring.springcore.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/niloy/spring/springcore/constructor/config.xml");
		Employee employee =  (Employee) context.getBean("emp");
		System.out.println(employee);
		context.close();
	}

}
