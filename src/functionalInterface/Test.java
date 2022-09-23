  package functionalInterface;

public class Test {

	public static void main(String[] args) {
	
//		Demo demo = new DemoImpl();
//		demo.method1();
		
		//using functional interface
//		Demo d = ()-> System.out.println("method 1");
//		d.method1();
		
		Sum sum = (p, q, r) -> System.out.println("result is: "+(p+q+r));;
		sum.sum(50, 20, 25);

	}

}
