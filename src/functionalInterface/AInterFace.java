package functionalInterface;

@FunctionalInterface
public interface AInterFace {

	public void method1();
	default void defaultMethod() {
		System.out.println("This is default method from AInterface");
	}
	
}
