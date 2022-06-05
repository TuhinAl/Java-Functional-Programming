package streamApi.chapterTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {

	public static void main(String[] args) {
		  List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                  new Apple(155, "green"),
                  new Apple(120, "red"));	
		  
		  
		  List<Apple> apples = filterApples(inventory, FilteringApples::isGreenApple);
		  System.out.println("apples: "+apples);

	}
	
	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple>predicate){
		
		List<Apple> filteredApples = new ArrayList<>();
		for(Apple apple: inventory) {
			if(predicate.test(apple)) {
				filteredApples.add(apple);
			}
		}
		return filteredApples;
	}
	
	
	public static List<Apple> filterHeavyApple(List<Apple> inventory){
		List<Apple> filteredApples = new ArrayList<>();
		for(Apple apple: inventory) {
			if(apple.getWeight() >= 150) {
				filteredApples.add(apple);
			}
		}
		return filteredApples;
		
	}
	
	public static List<Apple> filterGreenApple(List<Apple> inventory){
		List<Apple> filteredApples = new ArrayList<>();
		for(Apple apple: inventory) {
			if("green".equalsIgnoreCase(apple.getColor())) {
				filteredApples.add(apple);
			}
		}
		return filteredApples;
		
	}
	
	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}


}
