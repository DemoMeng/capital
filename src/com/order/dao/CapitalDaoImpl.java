package com.order.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.capital.entity.Capital;



@Repository
@Scope("prototype")
public class CapitalDaoImpl implements CapitalDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Capital> getAllCapital() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Capital").getResultList();
	}

}
