package com.niloy.springcoreadvanced.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/niloy/springcoreadvanced/autowiring/config.xml");
		Employee employee =  (Employee) context.getBean("emp");
		System.out.println(employee);
		context.close();
	}

}
