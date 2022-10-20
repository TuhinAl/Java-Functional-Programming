package stream;

import java.util.List;
import java.util.stream.Collectors;

import functionalInterface.CustomData;
import functionalInterface.Student;

public class FilterDemo {

	public static void main(String[] args) {
		List<Student> studentList = CustomData.getData();
		
		
		// filter with multiple condition
		studentList.stream()
		.filter(student -> student.getCgpa() > 3.88 && student.getGender()
				.equalsIgnoreCase("male"))
		.filter(s -> s.getName().startsWith("K"))
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e.getName()));
		
		
		// filter single object
		Student studentFindAny = studentList.stream()
		.filter(student -> student.getCgpa() > 3.88 && student.getGender()
				.equalsIgnoreCase("male"))
		.filter(s -> s.getName().startsWith("K"))
		.findAny()
		.orElseGet(null);
		System.out.println(studentFindAny.getHonors());
		
		String studentNames = studentList.stream()
				.filter(student -> student.getCgpa() > 3.88 && student.getGender()
						.equalsIgnoreCase("male"))
				.filter(s -> s.getName().startsWith("K"))
				.map(e -> e.getName())
				.findAny()
				.orElse("");
		
		System.out.println(studentNames);
		
	}
}
