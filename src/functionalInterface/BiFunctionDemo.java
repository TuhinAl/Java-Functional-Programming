package functionalInterface;

import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		List<Student> studentList = CustomData.getData();
		BiFunction<Double, Integer, Double> biFunction = (cgpa, honors) -> cgpa+honors;
		System.out.println(biFunction.apply(2.73, 2));

	}

}


