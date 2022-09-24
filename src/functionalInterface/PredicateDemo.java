package functionalInterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {


	public static void main(String[] args) {
		List<Student> studentList = CustomData.getData();
		
		Predicate<Student> lowAge = a -> a.getAge() > 30;
		Predicate<Student> highAge = a -> a.getAge() < 80;
		Predicate<Student> equalAge = a -> a.getAge() == 20;
		
		
		List<Student> filterStudent = 	studentList.stream()
				.filter(lowAge.and(highAge).or(equalAge).negate())
		.collect(Collectors.toUnmodifiableList());
		
		System.out.println(filterStudent.size());
	}
}
