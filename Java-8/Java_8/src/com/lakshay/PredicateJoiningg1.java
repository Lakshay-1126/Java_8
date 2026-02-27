package com.lakshay;
import java.util.function.Predicate;

public class PredicateJoiningg1 {
	public static void checkPredicate(Predicate<Integer>p,int[]arr) {
		for(int i=0; i<arr.length; i++) {
			if(p.test(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int number[]= {10,20,-20,-10,40,60,45,100,21,110};
		Predicate<Integer>p1=i->i<50;
		Predicate<Integer>p2=i->i%2==0;
		Predicate<Integer>p3=i->i%2!=0;
//		checkPredicate(p1,number);
//		checkPredicate(p2,number);
//		checkPredicate(p3,number);
//		Predicate<Integer>oddNumber=p2.negate();
//		checkPredicate(oddNumber,number);
		Predicate<Integer>evenNumberANDlessThanFifty=p1.and(p2);
		Predicate<Integer>oddNumberAndLessThanFifty=p1.and(p3);
		Predicate<Integer>oddNumberorLessThanFifty=p1.or(p3);
		checkPredicate(evenNumberANDlessThanFifty,number);
		checkPredicate(oddNumberAndLessThanFifty,number);
		checkPredicate(oddNumberorLessThanFifty,number);
		
	}

}