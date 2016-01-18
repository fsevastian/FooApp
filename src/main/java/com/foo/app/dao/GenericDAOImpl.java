package com.foo.app.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED)
public class GenericDAOImpl<T> implements IGenericDAO<T> {

	@Resource
	private SessionFactory sessionFactory;
	
	private Class< T> type;

	public GenericDAOImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];
	}
	
	public T save(final T o) {
		return (T) sessionFactory.getCurrentSession().save(o);
	}

	public void delete(final T o) {
		sessionFactory.getCurrentSession().delete(o);
	}

	public T get(final Long id) {
		return (T) sessionFactory.getCurrentSession().get(type, id);
	}

	public T merge(final T o) {
		return (T) sessionFactory.getCurrentSession().merge(o);
	}

	public void saveOrUpdate(final T o) {
		sessionFactory.getCurrentSession().saveOrUpdate(o);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	
}
