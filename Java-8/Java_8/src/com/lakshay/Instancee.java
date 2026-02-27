package com.lakshay;

interface Lakshay2{
	public abstract int lengthOfTheString(String s);
}
public class Instancee{
	public int m1(String s) {
		return s.length();
	}
	public static void main(String[] args) {
		Instancee i=new Instancee();
		Lakshay2 p= i::m1;
		System.out.println(p.lengthOfTheString("Lakshay"));
	}
}