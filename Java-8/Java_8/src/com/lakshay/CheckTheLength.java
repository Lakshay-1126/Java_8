package com.lakshay;
import java.util.function.Predicate;

//public class CheckTheLength implements Predicate<String>{
//		public boolean test(String t) {
//			if(t.length()>7) {
//				return true;
//			}else {
//				return false;
//			}
//		}
//		public static void main(String[] args) {
//			Predicate<String>p=new CheckTheLength();
//			System.out.println(p.test("Lakshay"));
//			System.out.println(p.test("LakshayKumawat"));
//		}
//}


// ...................................  //
// BY USING LAMBDA EXPRESSION
public class CheckTheLength{
	public static void main(String[] args) {
		Predicate<String> p=t->t.length()>7;
		System.out.println(p.test("Lakshay"));
		System.out.println(p.test("LakshayKumawat"));
	}
}