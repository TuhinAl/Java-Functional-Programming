package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericDemo {
	
	public static void main(String[] args) {
		
		Container<String> newStore = new Store<>();
		newStore.set("Java");
		System.out.println(newStore.get());
		
		Container<Integer> newNumber = new Store<>();
		newNumber.set(112);
		System.out.println(newNumber.get());
		
		
		Container<List<String>> listOfString = new Store<>();
		listOfString.set(Arrays.asList("Real Madrid", "Bayern Munich", "Man City", "Barcelona"));
		System.out.println(listOfString.get());
		
		List<Number> numberList = new ArrayList<>();
		
		numberList.add(new Integer(27));
		numberList.add(new Double(22.5));
		
		List[] array = new ArrayList[2];
		array[0] = new ArrayList<>();
	}

}

 interface Container<T> {
	 
	 void set(T a);
	 T get();
 }
 
 class Store<T> implements Container<T>{
	 private T a;
	 public void set(T a ) {
		 this.a = a;
	 }
	 
	 public T get() {
		 return a;
		 
	 }
 }
 
