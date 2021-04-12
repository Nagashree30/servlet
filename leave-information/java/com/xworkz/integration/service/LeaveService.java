package com.xworkz.integration.service;

public interface LeaveService<T> {

	public boolean validateAndSave(T entity);
	
	
}
