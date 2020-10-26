package com.easysoft.lib.jdb.domain.dto;

import java.util.List;

public class PageResponse<T> {

	private long total;

	private List<T> rows;

	public PageResponse() {

	}

	public PageResponse(long total, List<T> rows) {
		this.total = total;
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public List<T> getRows() {
		return rows;
	}

}
