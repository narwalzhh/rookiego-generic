package com.rookiego.base.itf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rookiego.base.bo.query.PageQueryInfo;
import com.rookiego.base.bo.query.QueryInfo;
import com.rookiego.base.bo.query.model.CommQueryItem;
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
	 * 根据名称模糊查询
	 * 
	 * @param keyword
	 * @return
	 */
	List<T> listByNameLike(@Param("keyword") String keyword);

	/**
	 * 根据条件查询
	 * 
	 * @param queryInfo
	 * @return
	 */
	List<T> listByCond(@Param("queryInfo") QueryInfo queryInfo);

	/**
	 * 查询分页信息
	 * 
	 * @param pageQueryInfo
	 * @return
	 */
	List<T> pagination(@Param("pageQueryInfo") PageQueryInfo pageQueryInfo);

	/**
	 * 配合分页查询，查询数据总数
	 * 
	 * @param pageQueryInfo
	 * @return
	 */
	Long count(@Param("commQueryItem") CommQueryItem queryItem);
}
