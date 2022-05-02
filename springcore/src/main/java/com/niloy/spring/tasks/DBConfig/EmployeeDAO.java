package com.niloy.spring.tasks.DBConfig;

public class EmployeeDAO {
	private DBConfig dbConfig;


	@Override
	public String toString() {
		return dbConfig.toString();
	}


	public DBConfig getDbConfig() {
		return dbConfig;
	}


	public void setDbConfig(DBConfig dbConfig) {
		this.dbConfig = dbConfig;
	}

}
