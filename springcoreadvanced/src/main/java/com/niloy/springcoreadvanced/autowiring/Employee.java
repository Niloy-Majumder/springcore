package com.niloy.springcoreadvanced.autowiring;

public class Employee {

	Address address;
	
	Employee(Address address){
		this.address=address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}



}
