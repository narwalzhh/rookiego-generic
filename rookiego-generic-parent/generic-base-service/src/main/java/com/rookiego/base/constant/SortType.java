package com.rookiego.base.constant;

/**
 * 排序类型
 *
 * @author zhh
 * @date 2017年7月26日-下午11:18:48
 * @jdk jdk1.8
 */
public enum SortType {

	ASC("asc", "正项排序"),

	DESC("desc", "逆向排序");

	private String index;

	private String name;

	private SortType(String index, String name) {
		this.index = index;
		this.name = name;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
