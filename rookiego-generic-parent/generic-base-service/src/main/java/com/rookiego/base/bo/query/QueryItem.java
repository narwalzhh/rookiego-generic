package com.rookiego.base.bo.query;

import java.io.Serializable;

import com.rookiego.utils.anno.FieldDsc;

/**
 * 查询对象
 *
 * @author zhh
 * @date 2017年7月26日-下午11:22:44
 * @jdk jdk1.8
 */
public class QueryItem implements Serializable {

	private static final long serialVersionUID = -2612489246496267657L;

	@FieldDsc(value = "属性")
	private String field;

	@FieldDsc(value = "运算符")
	private String operator;

	@FieldDsc(value = "属性值")
	private Object value;

	public QueryItem(String field, String operator, Object value) {
		this.field = field;
		this.operator = operator;
		this.value = value;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
