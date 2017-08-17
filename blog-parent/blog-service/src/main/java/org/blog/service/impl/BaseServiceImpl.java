package org.blog.service.impl;

import org.blog.dao.mapper.BaseMapper;
import org.blog.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl<T, M extends BaseMapper<T>> implements BaseService<T>{

	private M mapper;
	
	@Override
	public int deleteById(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(T t) {
		return mapper.insert(t);
	}

	@Override
	public T selectById(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(T t) {
		return mapper.updateByPrimaryKey(t);
	}

	@Override
	public int update(T t) {
		return mapper.updateByPrimaryKey(t);
	}

}
