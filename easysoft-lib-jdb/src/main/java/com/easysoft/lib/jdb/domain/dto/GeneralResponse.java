package com.easysoft.lib.jdb.domain.dto;

import java.util.Date;

public class GeneralResponse {

	private long timestamp;

	private boolean success;

	private int code;

	private String text;

	private String message;

	private String path;

	private String method;

	private Object data;

	public GeneralResponse() {                         
		this.timestamp = new Date().getTime();
	}

	public void success(int code, String text, String path, String method, Object data) {
		this.success = true;
		this.code = code;
		this.text = text;
		this.message = "";
		this.path = path;
		this.method = method;
		this.data = data;
	}
	
	public void fail(int code, String text, String message, String path, String method) {
		this.success = false;
		this.code = code;
		this.text = text;
		this.message = message;
		this.path = path;
		this.method = method;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
