package com.lakshay;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {
	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(35);
		l1.add(40);
		l1.add(50);
		Stream<Integer>streamOfNumbers=l1.stream();
		//l1.stream().filter(i->i%2==0).forEach(i->System.out.print(i+" "));
		//streamOfNumbers.forEach(i->System.out..println(i%2!=0))
		l1.stream().filter(i->i%2==0).map(i->i*i).forEach(i->System.out.print(i+" "));
		
	}
}