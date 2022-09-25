package functionalInterface;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {
	
	public static void main(String[] args) {
		List<Student> studentList = CustomData.getData();
		
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
		
		System.out.println(studentList.stream()
				.map(nameUppercase.andThen(cgpaIncrease).andThen(honorsIncrease))
				.collect(Collectors.toList()).size());
	}

}
