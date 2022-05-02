package com.niloy.spring.springcore.propertiesplaceholder;

public class MyDAO {
	private String database;

	public MyDAO(String database) {
		super();
		this.database = database;
	}

	@Override
	public String toString() {
		return "MyDAO [database=" + database + "]";
	} 
}
