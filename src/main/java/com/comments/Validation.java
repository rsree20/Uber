package com.comments;

public class Validation {

	public boolean checkEmpty(String text) {
		if(text == null || text.isEmpty()) {
			return true;
		}
		return false;
	}
	public boolean isvalidmail(String text) {
		if(!text.contains("@")) {
			return true;
		}
		return false;
	}
}
