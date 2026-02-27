package com.lakshay;
import java.util.function.Predicate;

public class PredicateJoiningg implements Predicate<Integer>{
	public boolean test(Integer t) {
		if(t%2==0) {
			return true;
		}else {
		return false;
	}
}
	public static void main(String[] args) {
		int number[]= {10,20,40,-50,30,-30,70};
		Predicate<Integer>p=new PredicateJoiningg();
		System.out.println(p.test(number[4]));
	}
}