package com.tt.doodoo.forum.dao;

import java.io.Serializable;
import java.util.List;

import com.tt.doodoo.forum.utils.Page;

public interface BaseDao<T> {
	/**
	 * 
	 * @param id
	 * @return
	 */
	T load(Serializable id);
	
	T get(Serializable id) ;
	
	T save(T entity);
	
	T update (T entity);
	
	void remove(T entity);
	
	Page<T> pagedQuery(String hql, int pageNo, int pageSize, Object... values);
	
	public List<T> loadAll() ;
	
	public List<T> find(String hql);
	
	public List<T> find(String hql, Object... params);
	
}
