package com.niloy.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter Method");
		this.id = id;
	}

	public void hi() {
		System.out.println("Inside Hi method");
	}

	public void bye() {
		System.out.println("Inside bye Method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
