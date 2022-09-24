package functionalInterface;

import java.util.List;

public interface MainInterface {
	
	public static void main(String[] args) {
		
		List<Student> student = CustomData.getData();
		System.out.println(student.size());
	}
}
