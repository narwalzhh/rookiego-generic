package com.rookiego.base.itf.dao;

import java.util.List;

import com.rookiego.base.itf.BizObj;

/**
 * 基本通用维护数据库访问层
 *
 * @author zhh
 * @date 2017年7月26日-下午10:35:12
 * @jdk jdk1.8
 */
public interface BaseDAO<T extends BizObj> {

	/**
	 * 新增
	 * 
	 * @param entity
	 */
	void insert(T entity);

	/**
	 * 批量新增
	 * 
	 * @param entities
	 */
	void insertBatch(List<T> entities);

	/**
	 * 更新
	 * 
	 * @param entity
	 */
	void update(T entity);

	/**
	 * 批量更新
	 * 
	 * @param entities
	 */
	void updateBatch(List<T> entities);

	/**
	 * 删除
	 * 
	 * @param entity
	 */
	void delete(T entity);

	/**
	 * 批量删除
	 * 
	 * @param entities
	 */
	void deleteBatch(List<T> entities);

	/**
	 * 根据主键删除
	 * 
	 * @param id
	 */
	void deleteById(String id);

	/**
	 * 根据主键批量删除
	 * 
	 * @param ids
	 */
	void deleteByIds(List<String> ids);

}
