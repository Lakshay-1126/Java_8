package com.lakshay;

//Functional Interface
@FunctionalInterface
interface Lakshay1 {
 int lengthofTheString(String s);
}

public class Straticc {

	// Static method
	public static int lengthofTheString1(String s) {
		return s.length();
	}

	public static void main(String[] args) {

     // Method Reference
		Lakshay1 obj = Straticc::lengthofTheString1;

		System.out.println(obj.lengthofTheString("Lakshay Kumawat"));
	}
}