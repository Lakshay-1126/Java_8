package com.lakshay;
import java.util.function.Function;

//public class Functionn implements Function<String, String>{
//	public String apply(String s) {
//			return s.toUpperCase();
//	}
//	public static void main(String[] args) {
//		Function<String,String>ConvertToUpperCase=new Functionn();
//		System.out.println(ConvertToUpperCase.apply("Lakshay"));
//	}
//}

// ................................... //
//USING LAMBDA EXPRESSION:-------------
public class Functionn{
	public static void main(String[] args) {
		Function<String, String>ConvertToUpperCase=s->s.toUpperCase();
		System.out.println(ConvertToUpperCase.apply("Lakshay"));
	}
}
