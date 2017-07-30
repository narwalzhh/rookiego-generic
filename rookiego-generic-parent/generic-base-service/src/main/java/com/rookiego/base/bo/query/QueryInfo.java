package com.rookiego.base.bo.query;

import java.io.Serializable;
import java.util.List;

import com.rookiego.base.bo.query.model.CommQueryItem;
import com.rookiego.base.bo.query.model.SortItem;
import com.rookiego.utils.anno.FieldDsc;

public class QueryInfo implements Serializable {

	private static final long serialVersionUID = -1156642588696125195L;

	@FieldDsc(value = "通用查询条件")
	private CommQueryItem item;

	@FieldDsc(value = "排序条件")
	private List<SortItem> sort;

	public CommQueryItem getItem() {
		return item;
	}

	public void setItem(CommQueryItem item) {
		this.item = item;
	}

	public List<SortItem> getSort() {
		return sort;
	}

	public void setSort(List<SortItem> sort) {
		this.sort = sort;
	}

}
