package org.blog.dao.mapper;

import org.blog.model.User;

public interface BaseMapper<T> {
	
	int deleteByPrimaryKey(Integer id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
}
