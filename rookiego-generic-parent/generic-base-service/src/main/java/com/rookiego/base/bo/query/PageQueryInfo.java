package com.rookiego.base.bo.query;

import java.io.Serializable;
import java.util.List;

import com.rookiego.base.bo.query.model.CommQueryItem;
import com.rookiego.base.bo.query.model.SortItem;
import com.rookiego.utils.anno.FieldDsc;

/**
 * 分页条件查询条件
 *
 * @author zhh
 * @date 2017年7月30日-下午3:09:36
 * @jdk jdk1.8
 */
public class PageQueryInfo implements Serializable {

	private static final long serialVersionUID = 6866492488732134913L;

	@FieldDsc(value = "当前页码")
	private Integer pageIndex;

	@FieldDsc(value = "当前页大小")
	private Integer pageSize;

	@FieldDsc(value = "通用查询条件")
	private CommQueryItem item;

	@FieldDsc(value = "排序条件")
	private List<SortItem> sort;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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
