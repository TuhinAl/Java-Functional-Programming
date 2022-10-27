package stream;

import java.util.Optional;

import functionalInterface.Student;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Optional<Student> studentOptional = Optional.of(new Student(2,"Dixie",3.18,60,"Female",5));
		 String answer1 = "Yes";
	     String answer2 = null;
		
	     System.out.println("Non-Empty Optional:" +studentOptional);
	     System.out.println("Non-Empty Optional: value : " + studentOptional.get());
	     System.out.println("Empty Optional: "  +studentOptional.empty());
	     System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
	     
	     
	     //optional in real case
	     
	     SpeedCC cc = new SpeedCC("3000");
	     Engine engine = new Engine("porche", "p-150", Optional.of(cc));
	     Car car = new Car("Sports Car", "Porche", Optional.of(engine));
	     CarService service = new CarService();
	     service.getSpeed(Optional.of(car));
		
	}

}
