package com.uberValidation;

public class Uvalidations{
	public boolean isValidUname(String text) {
		if(text.length() != 10) {
			return true;
		}
		else {
			
				return false;
			}
	}
		
protected	boolean isvalidPwd(String text1){
			if(text1.length()!=20) {
				return true;
			}
			else {
				return false;
			}
			
		}

}

