package com.niloy.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired //  - Property level
	@Qualifier("address123")
	private Address address;
	
//	@Autowired - Constructor Level
//	Employee(Address address){
//		this.address=address;
//	}

	public Address getAddress() {
		return address;
	}
//	@Autowired   // setter Method Level
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}



}
