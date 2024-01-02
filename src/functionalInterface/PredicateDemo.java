package functionalInterface;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {


	public static void main(String[] args) {
		List<Student> studentList = CustomData.getData();
		int x [] = {10, 11, 12, 13, 17, 19, 20, 21, 22, 23, 24, 25};
		
		IntPredicate intValue = p -> p % 2 == 0;
//		Arrays.asList(x).stream().filter(primeNumber -> intValue.test(primeNumber))
//		.collect(Collectors.toList());
		Predicate<Student> lowAge = a -> a.getAge() > 30;
		Predicate<Student> highAge = a -> a.getAge() < 80;
		Predicate<Student> equalAge = a -> a.getAge() == 20;
		
		
		List<Student> filterStudent = 	studentList.stream()
				.filter(lowAge.and(highAge).or(equalAge).negate())
		.collect(Collectors.toUnmodifiableList());
		
		System.out.println(filterStudent.size());
	}
}
