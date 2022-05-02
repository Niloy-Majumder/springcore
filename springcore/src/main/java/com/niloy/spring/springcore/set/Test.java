package com.niloy.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/niloy/spring/springcore/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) context.getBean("carDealer");
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
		context.close();
	}

}
