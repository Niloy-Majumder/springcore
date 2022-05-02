package com.niloy.springcoreadvanced.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/niloy/springcoreadvanced/stereotype/annotations/config.xml");
		Instructor instructor =  (Instructor) context.getBean("inst");
//		Instructor instructor2 =  (Instructor) context.getBean("inst");
		System.out.println(instructor);
//		System.out.println(instructor2.hashCode());
		context.close();
	}

}
