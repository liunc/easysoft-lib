package com.easysoft.lib.jdb.domain.valueobject;

public class YesNo {

	public static final String YES = "Y";

	public static final String NO = "N";

	public static String get(String value) {
		if (YES.equalsIgnoreCase(value)) {
			return YES;
		}
		return NO;
	}
}
