package com.tt.doodoo.forum.dao;

import java.io.Serializable;

import com.tt.doodoo.forum.utils.Page;

public interface BaseDao<T> {
	
	T load(Serializable id);
	
	T get(Serializable id) ;
	
	T save(T entity);
	
	T update (T entity);
	
	void remove(T entity);
	
	Page<T> pagedQuery(String hql, int pageNo, int pageSize, Object... values);
	
}
