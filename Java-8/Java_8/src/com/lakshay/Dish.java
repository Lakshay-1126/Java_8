package com.lakshay;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Collector2 {
	String name;
	int calories;
	boolean isVeg;
	String type;
	int price;
	public Collector2(String dishKaName, int calories, boolean isVeg, String type, int price) {
		this.name=dishKaName;
		this.calories=calories;
		this.isVeg=isVeg;
		this.type=type;
		this.price=price;
	}
	public String toString() {
		return "Collector2[name = " + name + ", calories = " + calories + ", isVeg = " + isVeg + ", type = " + type + ", price = " + price + "]";		
	}
}
public class Dish{	
	public static void main(String[] args) {
		Collector2 c1=new Collector2("Chicken biryani", 300,false,"Village Style",200);
		Collector2 c2=new Collector2("Fish Curry", 400, false,"Restaurant style", 300);
		Collector2 c3=new Collector2("Veg Rice",350,true,"Restaurant style", 250);
		Collector2 c4=new Collector2("Dal Tadka and chapati", 200,true,"Dhaba style",350);
		Collector2 c5=new Collector2("Manchurian",200,true,"chinese style",100);
		Collector2 c6=new Collector2("Pizza",100,true,"chiense style", 289);
		Collector2 c7=new Collector2("Idli-Dosa",250,true,"South indian Style", 380);
		Collector2 c8=new Collector2("juice",90,true,"processes style",60);
		List<Collector2>dishes=Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8);
		long countOfDishes=dishes.stream().collect(Collectors.counting());
		System.out.println(countOfDishes);		
		Comparator<Collector2>maximum=Comparator.comparingInt(i->i.calories);
		Optional<Collector2>dishWithMaxCalories=dishes.stream().collect(Collectors.maxBy(maximum));
		System.out.println(dishWithMaxCalories);
		Comparator<Collector2>minimum=Comparator.comparingInt(i->i.calories);
		Optional<Collector2>dishwithMinCalories=dishes.stream().collect(Collectors.minBy(minimum));
		System.out.println(dishwithMinCalories);
	}
}