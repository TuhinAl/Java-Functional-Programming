package streamApi.chapterTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {

	public static void main(String[] args) {
		

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
