package com.lakshay;

@FunctionalInterface
interface A{
	public abstract void m1(int a, int b);
}
public class Main {
	public static void main(String[] args) {
		A obj=(a,b)->System.out.println(a+b);
		obj.m1(10, 10);
	}
}
