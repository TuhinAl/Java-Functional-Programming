package stream;

import functionalInterface.CustomData;
import functionalInterface.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParallelStream {

	public static void main(String[] args) {
		List<Student> studentList = CustomData.getData();
		//		 studentList
		//				.parallelStream()
		//				.filter(e -> e.getAge() < 30 && e.getAge() > 20)
		//				.map(cgpa -> cgpa.getCgpa()+2)
		//				.forEach(e -> System.out.println(e));

		// groupBy gender a list and count
		Map<String, Long> studentGroupByAndCount = studentList
				.stream()
				.collect(
						Collectors.groupingBy(
								e -> e.getGender(), Collectors.counting()
								)
						);

		System.out.println(studentGroupByAndCount);


		//Group by gender � Collectors.groupingBy and Collectors.mapping example.
		Map<String, List<Student>> groupByGender  = studentList
				.stream()
				.collect(
						Collectors.groupingBy(Student::getGender)
						);


		groupByGender
		.entrySet()
		.stream()
		.forEach(e -> System.out.println(e +"\n\n"));
		
		//convert stream to array
		String lines = "java8 stream lambda functional interface";
		String [] array = Arrays.stream(lines.split("\\s+"))
		.map(e -> e).toArray(String[]::new);
		
		for(String value : array) {
			System.out.println(value);
		}
		
		
		// sorted  by name
		studentList.stream()
		.filter(e -> e.getCgpa() > 3.5 && e.getAge() <30)
		.sorted(Comparator.comparing(Student::getName))
		.forEach(e -> System.out.println(e));
//		.collect(Collectors.toList());
		
		// reverse sorted by name
		System.out.println("=============== reverse sorted by name==============");
		studentList.stream()
		.filter(e -> e.getCgpa() > 3.5 && e.getAge() <30)
		.sorted(Comparator.comparing(Student::getName).reversed())
		.forEach(e -> System.out.println(e));
		
		
		// sum num of array [there 2 ways]
		//

	}

}
