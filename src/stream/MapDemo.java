package stream;

import functionalInterface.CustomData;
import functionalInterface.Student;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		//map(Function, BiFunction); Function -> T apply(R r)
		// to combine multiple apply , we have to use  andThen()
		
		//age between 20-25 name should be uppercase
		List<Student> studentList = CustomData.getData();
		
		studentList.stream()
		.map(student -> student.getCgpa()+2)
		.collect(Collectors.toList());
		
		// filter() and map() combined together
		
		studentList
		.stream()
		.filter(student -> student.getCgpa() >= 3.99)
		.map(name -> name.getName().toUpperCase())
		.collect(Collectors.toList())
		.forEach(print -> System.out.println(print));;
	}

}
