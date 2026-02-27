package com.lakshay;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		Stream<Integer>str=al.stream();
		al.forEach(i->System.out.println(i));
	
	}
}