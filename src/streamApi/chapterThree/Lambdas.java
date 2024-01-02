package streamApi.chapterThree;

import streamApi.chapterTwo.Apple;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {
		
		Runnable r = () -> System.out.println("Hello!");

	}
	
	public static List<Apple> filter(List<Apple> inventory, ApplePredicate p){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory){
			if(p.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}   

}
