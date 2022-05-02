package com.niloy.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/niloy/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages countriesAndLangs = (CountriesAndLanguages) context.getBean("countryAndLangs");
		System.out.println(countriesAndLangs);
		context.close();
	}

}
