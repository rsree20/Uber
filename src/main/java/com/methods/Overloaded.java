package com.methods;

public class Overloaded {
	public void m1() {
		System.out.println("no-arg");
	}
public void m1(int i) {
	System.out.println("int-arg");
}
public void m1(double d) {
	System.out.println("double-arg");
}
public void m1(String s) {
	System.out.println("string-arg");
}
public static void main(String[] args) {
	System.out.println("start main method");
	Overloaded load=new Overloaded();
	load.m1();
	load.m1(10);
	load.m1(55);
	load.m1(56);
	load.m1(10.6);
	load.m1(67.88);
	load.m1("raj");
	System.out.println("ens main method");
	
	
}
}
