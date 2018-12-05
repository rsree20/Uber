package com.rama.controller;

public class validate {

	public boolean checkEmpty(String text) {
		if(text==null  || text.isEmpty()) {
			return true;
		}
		return false;
	}
	public boolean isValidMobile(String text) {
		if(text.length()!=10) {
			return true;
			
		}
		return false;
	}
}
