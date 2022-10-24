package stream;

import java.util.List;

import functionalInterface.CustomData;
import functionalInterface.Student;

public class ParallelStream {

	public static void main(String[] args) {
		List<Student> studentList = CustomData.getData();
//		int sum = studentList
//				.parallelStream()
//				.filter(e -> e.getAge() < 30 && e.getAge() > 20)
//				.reduce(0, Integer::sum);

	}

}
