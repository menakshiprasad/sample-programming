package com.jenkov.tutorials.jdbc;

public interface EmpInterface {

	default String address() {
		return "Stone Manor";
	}
	
	public String phone();
}
