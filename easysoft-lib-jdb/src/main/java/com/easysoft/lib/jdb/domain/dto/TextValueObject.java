package com.easysoft.lib.jdb.domain.dto;

public class TextValueObject {

	private String text;
	
	private String value;

	public TextValueObject(){

	}

	public TextValueObject(String text, String value){
		this.text = text;
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
