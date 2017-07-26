package com.rookiego.base.itf;

/**
 * 实体通用接口
 *
 * @author zhh
 * @date 2017年7月26日-下午10:32:50
 * @jdk jdk1.8
 */
public interface BizObj {

	/**
	 * 获取主键
	 * 
	 * @return
	 */
	String getId();

	/**
	 * 获取编码
	 * 
	 * @return
	 */
	String getCode();

	/**
	 * 获取名称
	 * 
	 * @return
	 */
	String getName();

	/**
	 * 获取pid
	 * 
	 * @return
	 */
	String getPid();

}
