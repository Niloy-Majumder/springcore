package com.niloy.spring.springcore.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/niloy/spring/springcore/List/listconfig.xml");
	Hospital hospital = (Hospital) context.getBean("hospital");
	System.out.println(hospital.getName());
	System.out.println(hospital.getDepartments());
	context.close();
	}

}
