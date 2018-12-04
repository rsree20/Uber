package com.comments;

public class Validation {

	public boolean checkEmpty(String text) {
		if(text == null || text.isEmpty()) {
			return true;
		}
		return false;
	}
}
