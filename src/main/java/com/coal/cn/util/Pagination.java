package com.coal.cn.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author zz ��ҳ������
 * @param <T>
 */
public class Pagination<T> {
	private int pageNumber;
	private int pageSize;
	private int total; // ������
	private List<T> rows; // ��ҳ����
	private Map<String, Object> queryParams = new HashMap<String, Object>();

	public Pagination() {

	}

	public Pagination(int pageNumber, int pageSize) {
		super();
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}

	public Pagination(int total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public Map<String, Object> getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(Map<String, Object> queryParams) {
		this.queryParams = queryParams;
	}

	@Override
	public String toString() {
		return "Pagination [pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", total=" + total + ", rows=" + rows
				+ ", queryParams=" + queryParams + "]";
	}

}
