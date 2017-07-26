package com.rookiego.base.itf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rookiego.base.itf.BizObj;

/**
 * 基本通用查询数据库访问层
 *
 * @author zhh
 * @date 2017年7月26日-下午10:35:21
 * @jdk jdk1.8
 */
public interface BaseQryDAO<T extends BizObj> {

	/**
	 * 根据主键查询
	 * 
	 * @param id
	 * @return
	 */
	T getById(@Param("id") String id);

	/**
	 * 根据编码查询
	 * 
	 * @param code
	 * @return
	 */
	T getByCode(@Param("code") String code);

	/**
	 * 根据主键批量查询
	 * 
	 * @param ids
	 * @return
	 */
	List<T> listByIds(@Param("ids") List<String> ids);

	/**
	 * 根据上级节点查询
	 * 
	 * @param pid
	 * @return
	 */
	List<T> listByPid(@Param("pid") String pid);

	/**
	 * 根据名称和编码批量查询
	 * 
	 * @param keyword
	 * @return
	 */
	List<T> listByCodeAndNameLike(@Param("keyword") String keyword);

}
