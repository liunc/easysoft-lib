package com.easysoft.lib.jdb.infrastructure;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class PageHelper {

	public Pageable getPageRequest(int page, int size, String sortField, String sort) {
		
		if (StringUtils.hasText(sortField)) {
			return PageRequest.of(page, size, isAscending(sort) ? Direction.DESC : Direction.ASC, sortField);
		}
		return PageRequest.of(page, size);
	}

	private boolean isAscending(String sort) {
		if ("desc".equalsIgnoreCase(sort)) {
			return false;
		}
		return true;
	}
}
