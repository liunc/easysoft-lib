package org.easysoft.lib.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class LocalMessageSource {

	@Autowired
	private MessageSource messageSource;

	/**
	 * 根据关键字获取本地化言字符串
	 * 
	 * @param key 关键字
	 * @return 返回字符串
	 */
	public String getMessage(String key) {
		return this.getMessage(key, null);
	}

	/**
	 * 根据关键字获取本地化言字符串
	 * 
	 * @param key  关键字
	 * @param args
	 * @return 返回字符串
	 */
	public String getMessage(String key, Object[] args) {
		return this.messageSource.getMessage(key, args, LocaleContextHolder.getLocale());
	}

}
