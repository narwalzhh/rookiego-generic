package com.rookiego.base.bo.query.model;

import java.io.Serializable;
import java.util.List;

import com.rookiego.utils.anno.FieldDsc;

/**
 * IN条件下查询对象
 *
 * @author zhh
 * @date 2017年7月26日-下午11:25:14
 * @jdk jdk1.8
 */
public class QueryItemIn implements Serializable {

	private static final long serialVersionUID = 3298777488173776672L;

	@FieldDsc(value = "属性")
	private String field;

	@FieldDsc(value = "运算符")
	private String operator;

	@FieldDsc(value = "属性值")
	private List<Object> values;

	public QueryItemIn(String field, String operator, List<Object> values) {
		this.field = field;
		this.operator = operator;
		this.values = values;
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

	public List<Object> getValues() {
		return values;
	}

	public void setValues(List<Object> values) {
		this.values = values;
	}

}
