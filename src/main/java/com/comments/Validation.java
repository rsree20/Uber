package com.comments;

import com.mysql.jdbc.util.ResultSetUtil;

public class Validation {

	public boolean checkEmpty(String text) {
		if(text == null || text.isEmpty()) {
			return true;
		}
		return false;
	}
	public boolean isValidMobile(String text) {
		if(text.length() != 10) {
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
	public boolean isValidAadharCard() {
		System.out.println("validation logic for adhar is here");
		return false;
	}
}
