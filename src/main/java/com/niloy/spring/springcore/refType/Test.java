package com.niloy.spring.springcore.refType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/niloy/spring/springcore/refType/config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		context.close();
	}

}
