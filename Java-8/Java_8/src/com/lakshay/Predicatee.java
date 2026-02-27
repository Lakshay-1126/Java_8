package com.lakshay;
import java.util.function.Predicate;

//public class Predicatee implements Predicate<Integer> {
//	public boolean test(Integer t) {
//		if(t>100) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	public static void main(String args[]) {
//	Predicate<Integer>p=new Predicatee();
//	p.test(50);
//	System.out.println(p.test(50)); 
//	}
//}

// ............................... //
//USING LAMBDA EXPRESSION
public class Predicatee{
	public static void main(String[] args) {
		Predicate<Integer>p=i->i>100;
		System.out.println(p.test(1000));
		System.out.println(p.test(10));
		System.out.println(p.test(100));
		System.out.println(p.test(50));
	}
}