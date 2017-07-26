package com.rookiego.base.bo;

import java.io.Serializable;
import java.util.List;

import com.rookiego.base.itf.BizObj;
import com.rookiego.utils.anno.FieldDsc;

/**
 * 通用分页信息
 *
 * @author zhh
 * @param <T>
 * @date 2017年7月26日-下午10:56:02
 * @jdk jdk1.8
 */
public class PageInfo<T extends BizObj> implements Serializable {

	private static final long serialVersionUID = 5036609076516917039L;

	@FieldDsc(value = "当前页码")
	private Integer pageIndex;

	@FieldDsc(value = "当前页大小")
	private Integer pageSize;

	@FieldDsc(value = "数据内容")
	private List<T> content;

	@FieldDsc(value = "总页数")
	private Integer totalPage;

	@FieldDsc(value = "总数据条数")
	private Integer totalElement;

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

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalElement() {
		return totalElement;
	}

	public void setTotalElement(Integer totalElement) {
		this.totalElement = totalElement;
	}

}
