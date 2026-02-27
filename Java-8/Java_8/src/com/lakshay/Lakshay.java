package com.lakshay;

@FunctionalInterface
interface B{
	public abstract int getTheLength(String s);
}
public class Lakshay  {
	//public int getTheLength(String s) {
	//	return s.length();
	//}
	public static void main(String[] args) {
		B obj= s->s.length();
		System.out.println(obj.getTheLength("Lakshay"));
	}
}