package com.comments;

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
	public void isValidPancard(String text) {
		System.out.println("checking pancard!!");
		System.out.println("Done with pancard validation");
	}
}
