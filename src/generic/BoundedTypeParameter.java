package generic;

public class BoundedTypeParameter<U> {
	
	public static <T extends Comparable<T>> int countGreaterThan(T [] array, T element) {
		
		int count = 0;
		for(T iterate : array) {
			if(iterate.compareTo(element) > 0) {
				++count;	
			}
		}
		return count;
	}

	public static void main(String[] args) {
		

	}

}
