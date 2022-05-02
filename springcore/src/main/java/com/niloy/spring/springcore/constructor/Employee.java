package com.niloy.spring.springcore.constructor;

public class Employee {
	int id;
	Address address;

	public Employee(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
}
