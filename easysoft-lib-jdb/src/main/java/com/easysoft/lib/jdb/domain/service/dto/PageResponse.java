package com.easysoft.lib.jdb.domain.service.dto;

import java.util.List;

public class PageResponse<T> {

	private long total;

	private List<T> results;

	public PageResponse() {

	}

	public PageResponse(long total, List<T> results) {
		this.total = total;
		this.results = results;
	}

	public long getTotal() {
		return total;
	}

	public List<T> getResults() {
		return results;
	}

}
