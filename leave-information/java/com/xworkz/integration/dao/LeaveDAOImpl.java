package com.xworkz.integration.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.integration.entity.LeaveEntity;

public class LeaveDAOImpl implements LeaveDAO {

	@Override
	public void save(LeaveEntity entity) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");

		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		System.out.println(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
