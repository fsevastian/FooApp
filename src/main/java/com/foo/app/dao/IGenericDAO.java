package com.foo.app.dao;

public interface IGenericDAO<T> {
	
	public T save(final T o);

	public void delete(final T o);

	public T get(final Long id);

	public T merge(final T o);

	public void saveOrUpdate(final T o);

}
