package com.niloy.spring.tasks.DBConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/niloy/spring/tasks/DBConfig/beans.xml");
		EmployeeDAO Dao = (EmployeeDAO) context.getBean("dao");
		
		DBConfig dbcon=Dao.getDbConfig();
		System.out.println(dbcon.getDriverName());
		System.out.println(dbcon.getUrl());
		System.out.println(dbcon.getUserName());
		System.out.println(dbcon.getPassword());
		context.close();
	}

}
