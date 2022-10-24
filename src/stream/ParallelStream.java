package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import functionalInterface.CustomData;
import functionalInterface.Student;

public class ParallelStream {

	public static void main(String[] args) {
		List<Student> studentList = CustomData.getData();
//		 studentList
//				.parallelStream()
//				.filter(e -> e.getAge() < 30 && e.getAge() > 20)
//				.map(cgpa -> cgpa.getCgpa()+2)
//				.forEach(e -> System.out.println(e));
		 
		 // groupBy a list and count
		 Map<String, Long> studentGroupByAndCount = studentList
				 .stream()
				 .collect(
						 Collectors.groupingBy(
								 e -> e.getGender(), Collectors.counting()
								 )
						 );
		 
System.out.println(studentGroupByAndCount);
	}

}
