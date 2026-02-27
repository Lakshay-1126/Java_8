package com.lakshay;

interface Lakshay3{
	public abstract int add(int a, int b);
}
public class Instancee1 {
	public int m1(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Instancee1 i=new Instancee1();
		Lakshay3 p=i::m1;
		System.out.println(p.add(10, 10));
	}
}