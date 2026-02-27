package com.lakshay;
import java.util.function.Function;

//public class Functionn1 implements Function<String,Integer>{
//	public Integer apply(String t) {	
//		return t.length();
//	}
//	public static void main(String[] args) {
//		Function<String,Integer>f1=new Functionn1();
//		String []s={"Lakshay","Ramm","Yogesh"};
//		for(String ss:s) {
//			System.out.println(f1.apply(ss));	
//		}
//	}
//}

//................................... //
//USING LAMBDA EXPRESSION:-------------
public class Functionn1{
	public static void main(String[] args) {
		String s="Hii My Name is Lakshay Kumawat";
		Function<String,String>f1=i->i.replaceAll(" ", "");
		System.out.println(f1.apply(s));
		Function<String,Integer>f2=i->i.length()-i.replaceAll(" ", "").length();
		System.out.println(f2.apply(s));		
	}
}
