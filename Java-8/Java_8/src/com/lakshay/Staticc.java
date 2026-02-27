package com.lakshay;

interface MethodReference{
	int add(int a, int b);
}
public class Staticc {
	public static int add1(int a, int b) {
		return a+b;
	
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		 MethodReference obj= Staticc::add1;
		System.out.println(obj.add(10, 10));
		System.out.println( mul(10,10));
	}
}