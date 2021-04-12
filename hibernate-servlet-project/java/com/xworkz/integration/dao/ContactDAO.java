package com.xworkz.integration.dao;

import java.util.List;

import com.xworkz.integration.entity.ContactEntity;

public interface ContactDAO {

	public void create(ContactEntity entity);
	
	public ContactEntity findByName(String name);
	
	public ContactEntity findByEmail(String email);

	public List<ContactEntity> findAll();
}
