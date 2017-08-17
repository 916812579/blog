package org.blog.service;

public interface BaseService<T> {
	
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);

	/**
	 * 插入一个对象
	 * @param t
	 * @return
	 */
    int insert(T t);

    /**
     * 根据id查询一个对象
     * @param id
     * @return
     */
    T selectById(Integer id);

    int updateByPrimaryKeySelective(T t);

    /**
     * 根据id更新
     * @param t
     * @return
     */
    int update(T t);

}
