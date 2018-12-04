package com.validation;

public class ValidationTest {
	
	static String s="test";

	public static void main(String[] args) {
		
		emptyCheck(s);
		

	}

	private static void emptyCheck(String text) {
		if(!text.isEmpty())
		{
			System.out.println(text.length());
		}
		else {
			System.out.println("Field should not empty");
		}
		
		
	}

}
