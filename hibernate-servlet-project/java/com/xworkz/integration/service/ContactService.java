package com.xworkz.integration.service;

import java.util.List;

public interface ContactService<T> {

	public boolean validateAndSave(T entity);

	public T validateAndSearchByName(String name);

	public T validateAndSearchByEmail(String email);

	public List<T> getAll();
}
