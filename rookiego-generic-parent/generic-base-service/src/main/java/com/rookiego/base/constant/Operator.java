package com.rookiego.base.constant;

/**
 * 支持查询类型
 *
 * @author zhh
 * @date 2017年7月26日-下午11:12:45
 * @jdk jdk1.8
 */
public enum Operator {

	EQUAL("=", "相等"),

	NOTEQUAL("<>", "不相等"),

	GT(">", "大于"),

	GTE(">=", "大于等于"),

	LT("<", "小于"),

	LTE("<=", "小于等于"),

	LIKE("LIKE", "模糊查询"),

	LIKERIGHT("LIKERIGHT", "右模糊匹配"),

	LIKELEFT("LIKELEFT", "左模糊匹配"),

	IN("IN", "IN"),

	NOTIN("NOT IN", "not in"),

	ISNULL("IS NULL", "is null"),

	ISNOTNULL("IS NOT NULL", "is not null");

	private String index;

	private String name;

	private Operator(String index, String name) {
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
