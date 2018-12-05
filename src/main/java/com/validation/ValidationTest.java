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
			System.out.println("done with finding string length");
		}
		else {
			System.out.println("Field should not empty");
			System.out.println("srinu conflicts test");
			System.out.println("hello");
		}
		
		
	}

}
