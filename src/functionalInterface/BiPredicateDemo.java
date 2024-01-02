package functionalInterface;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Student> studentList = CustomData.getData();

		BiPredicate<Student, Student> cgpaAndHonorsFilter = (cgpa, honors) -> cgpa.getCgpa() > 3.5
				&& honors.getHonors() > 3;

		BiPredicate<Student, Student> cgpaAndHonorsFilter2 = (gender, string) -> gender.getGender()
				.equalsIgnoreCase("Female");

		BiPredicate<Student, Student> result = cgpaAndHonorsFilter.or(cgpaAndHonorsFilter2);

		System.out.println(studentList
				.stream()
				.filter(x -> result.test(x, x))
				.collect(Collectors.toList()).size());
	}
}
