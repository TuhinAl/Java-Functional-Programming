package stream;

import java.util.Optional;

public class Car {
	private String name;
	private String brand;
	private Optional<Engine> engine;
	
	
	
	public Car(String name, String brand, Optional<Engine> engine) {
		this.name = name;
		this.brand = brand;
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Optional<Engine> getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = Optional.ofNullable(engine);
	}

	
	
}
