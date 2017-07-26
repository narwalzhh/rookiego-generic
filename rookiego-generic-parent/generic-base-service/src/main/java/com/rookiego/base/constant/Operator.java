package com.rookiego.base.constant;

/**
 * 支持查询类型
 *
 * @author zhh
 * @date 2017年7月26日-下午11:12:45
 * @jdk jdk1.8
 */
public enum Operator {

	AND("and"),

	OR("or"),

	LIKE("like"),

	IN("in"),

	GT("greaterthan"),

	GTE("greaterthanorequal"),

	LT("lessthan"),

	LTE("lessthanorequal"),

	NOT("not");

	private String index;

	private Operator(String index) {
		this.index = index;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

}
