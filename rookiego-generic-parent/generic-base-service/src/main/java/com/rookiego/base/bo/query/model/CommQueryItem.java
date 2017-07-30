package com.rookiego.base.bo.query.model;

import java.io.Serializable;
import java.util.List;

import com.rookiego.utils.anno.FieldDsc;

/**
 * 基本查询信息
 *
 * @author zhh
 * @date 2017年7月30日-下午3:12:25
 * @jdk jdk1.8
 */
public class CommQueryItem implements Serializable {

	private static final long serialVersionUID = 2886277469749823705L;

	@FieldDsc(value = "AND条件")
	private List<QueryItem> and;

	@FieldDsc(value = "OR条件")
	private List<QueryItem> or;

	@FieldDsc(value = "IN条件")
	private List<QueryItemIn> in;

	public List<QueryItem> getAnd() {
		return and;
	}

	public void setAnd(List<QueryItem> and) {
		this.and = and;
	}

	public List<QueryItem> getOr() {
		return or;
	}

	public void setOr(List<QueryItem> or) {
		this.or = or;
	}

	public List<QueryItemIn> getIn() {
		return in;
	}

	public void setIn(List<QueryItemIn> in) {
		this.in = in;
	}

}
