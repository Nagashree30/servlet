package com.xworkz.integration.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.integration.entity.ContactEntity;

public class ContactDAOImpl implements ContactDAO {
	
 ContactEntity entity;
	@Override
	public void create(ContactEntity entity) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");

		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		System.out.println(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

	@Override
	public ContactEntity findByName(String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");

		
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("findByName");
		query.setParameter("name", name);
		return (ContactEntity) query.getSingleResult();
		
	}

	@Override
	public ContactEntity findByEmail(String email) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
 
		if(entity!=null) {
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("findByEmail");
		query.setParameter("email", email);
		return (ContactEntity) query.getSingleResult();
	}else {
		return null;
	}

	}

	@Override
	public List<ContactEntity> findAll() {
		System.out.println("invoke find all");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");

		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("findAll");
		List<ContactEntity> list = query.getResultList();
		System.out.println(list);
		return list;
	}
}
