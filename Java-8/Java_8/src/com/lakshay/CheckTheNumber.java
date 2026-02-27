package com.lakshay;
import java.util.function.Predicate;

//public class CheckTheNumber implements Predicate<Integer>{
//	public boolean test(Integer t) {
//		if(t>100) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//		public static void main(String[] args) {
//		Predicate<Integer>p=new CheckTheNumber();
//		System.out.println(p.test(10));
//		System.out.println(p.test(100));
//		System.out.println(p.test(1000));
//		}
//}

// .................................. //
// Using LAMBDA expression
public class CheckTheNumber{
public static void main(String[] args) {
	Predicate<Integer>p=t->t>100;
	System.out.println(p.test(10));
	System.out.println(p.test(100));
	System.out.println(p.test(1000));
}
}