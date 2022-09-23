package collections;

@FunctionalInterface
public interface BInterface {
	
	public void method1();
	default void defaultMethod() {
		System.out.println("This is default method from BInterface");
	}
}
