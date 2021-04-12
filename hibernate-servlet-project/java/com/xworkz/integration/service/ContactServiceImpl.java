package com.xworkz.integration.service;

import java.util.List;

import com.xworkz.integration.dao.ContactDAO;
import com.xworkz.integration.dao.ContactDAOImpl;
import com.xworkz.integration.entity.ContactEntity;

public class ContactServiceImpl implements ContactService<ContactEntity> {

	private ContactDAO dao;

	public ContactServiceImpl() {
		this.dao = new ContactDAOImpl();
		System.out.println("Created " + this.getClass().getSimpleName());

	}

	@Override
	public boolean validateAndSave(ContactEntity entity) {

		ContactEntity contactEntity = entity;
		boolean valid = false;
		String name = entity.getName();
		if (contactEntity != null)
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
				System.out.println("Name is valid");
				valid = true;
			} else {
				System.out.println("Name is not valid");
				valid = false;
			}

		if (valid) {

			String email = entity.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
				System.out.println("Email is valid");
				valid = true;
			} else {
				System.out.println("Email is not valid");
				valid = false;
			}
		}
		if (valid) {

			String company = entity.getCompany();
			if (company != null && !company.isEmpty()) {
				System.out.println("Company is valid");
				valid = true;
			} else {
				System.out.println("Company is not valid");
				valid = false;
			}
		}

		if (valid) {

			String phone = entity.getPhone();
			if (phone != null && !phone.isEmpty() && phone.length() == 10) {
				System.out.println("phone Number is valid");
				valid = true;
			} else {
				System.out.println("phone Number is not valid");
				valid = false;
			}
		}

		if (valid) {

			String about = entity.getAbout();
			if (about != null && !about.isEmpty() && about.length() <= 300) {
				System.out.println("About is valid");
				valid = true;
			} else {
				System.out.println("About is not valid");
				valid = false;
			}
		}
		if (valid) {

			this.dao.create(entity);

		}

		return valid;
	}

	@Override
	public ContactEntity validateAndSearchByName(String name) {
		System.out.println("invoked  validateAndSearchByName");
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
			System.out.println("Name is valid, can search");

			ContactEntity contactEntity = this.dao.findByName(name);
			System.out.println("ContactEntity found" + contactEntity);
			return contactEntity;
		} else {
			System.out.println("Name is invalid, cannot search");
		}
		return null;
	}

	@Override
	public ContactEntity validateAndSearchByEmail(String email) {

		System.out.println("invoked validateAndSearchByEmail");
		if(email!=null && !email.isEmpty() && email.contains("@")&& email.endsWith(".com")) {
			System.out.println("Email is valid , can search");
			ContactEntity contactEntity=this.dao.findByEmail(email);
			System.out.println("ContactEntity found" + contactEntity);
			return contactEntity;
		}else {
			System.out.println("Email is not valid cannot search");
		}
		return null;
	}

	@Override
	public List<ContactEntity> getAll() {
		System.out.println("invoke get all method in serviceImpl");
		return  this.dao.findAll();
	}
}
