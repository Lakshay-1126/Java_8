package com.lakshay;
import java.util.function.Predicate;

//public class Predicatee1 implements Predicate<String>{	
//	public boolean test(String s) {
//		if(s.length()>10) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//		Predicate<String>p=new  Predicatee1();
//		System.out.println(p.test("Lakshay"));
//		System.out.println(p.test("Lakshay Kumawat"));
//
//	}
//}

// ................................. //
//USING LAMBDA EXPRESSION
public class Predicatee1{
	public static void main(String[] args) {
		Predicate<String>p=s->s.length()>10;
		System.out.println(p.test("Lakshay"));
		System.out.println(p.test("Lakshay Kumawat"));
	}
}