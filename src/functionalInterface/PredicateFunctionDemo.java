package functionalInterface;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctionDemo {

	public static void main(String[] args) {

		List<Student> studentList = CustomData.getData();

		Predicate<Student> ageDiffLow = student -> student.getAge() < 15;

		Predicate<Student> ageDiffHigh = student -> student.getAge() > 75;

		Function<Student, Student> nameUppercase = e -> {
			e.setName(e.getName().toUpperCase().concat(" Khan"));;
			return e;
		};

		Function<Student, Student> cgpaIncrease = e -> {
			e.setCgpa(e.getCgpa() + 2);
			return e;
		};

		Function<Student, Student> honorsIncrease = e -> {
			e.setHonors(e.getHonors()+10);
			return e;
		};

		Predicate<Student> predicate = ageDiffHigh.or(ageDiffLow);
		Function<Student, Student> function = nameUppercase
				.andThen(cgpaIncrease.andThen(honorsIncrease));
		
		List<Student> result = studentList
				.stream()
				.map(function)
				.filter(predicate)
				.collect(Collectors.toList());

		System.out.println(result.size());


		Function<Integer, Integer> numberOne = n -> n+1;
		Function<Integer, Integer> numberTwo = n -> n*n;

		System.out.println(numberOne.andThen(numberTwo).apply(3)); //10
		System.out.println(numberOne.compose(numberTwo).apply(3));//16
		System.out.println("Hello");
	}

}
