package com.easysoft.lib.jdb.domain.valueobject;

public class ZeroOne {

	public static final String ZERO = "0";

	public static final String ONE = "1";

	public static String[] all() {

		return new String[] { ONE, ZERO };
	}

	public static String get(String value) {
		if (ONE.equals(value)) {
			return ONE;
		}
		return ZERO;
	}
}
