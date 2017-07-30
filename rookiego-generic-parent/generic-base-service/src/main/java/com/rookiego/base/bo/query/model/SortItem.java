package com.rookiego.base.bo.query.model;

import java.io.Serializable;

import com.rookiego.utils.anno.FieldDsc;

/**
 * 排序字段
 *
 * @author zhh
 * @date 2017年7月26日-下午11:27:19
 * @jdk jdk1.8
 */
public class SortItem implements Serializable {

	private static final long serialVersionUID = -268281738844944472L;

	@FieldDsc(value = "属性")
	private String field;

	@FieldDsc(value = "顺序")
	private String order;

	public SortItem(String field, String order) {
		this.field = field;
		this.order = order;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}
