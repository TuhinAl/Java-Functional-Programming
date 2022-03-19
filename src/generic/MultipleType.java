package generic;

import java.util.Arrays;
import java.util.List;

public class MultipleType<K, V> implements Pair<K, V>{

	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}

	
	public V getValue() {
		return value;
	}


	public MultipleType(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public static void main(String[] args) {
		MultipleType<Integer, String> list1 = new MultipleType<Integer, String>(7, "Ronaldo");
		MultipleType<Integer, List<String>> list2 = new MultipleType<Integer,  List<String>>(7, Arrays.asList("Real Madrid", "Barcelon","Arsenal"));
		System.out.println("List -1: "+list1.getKey() +" and "+list1.getValue());
	
		System.out.println("List -2: "+list2.getKey() +" and values "+list2.getValue());
	}
	
	
	
	

}

 interface Pair<K, V>{
	public K getKey();
	public V getValue();
}

