package stream;

import java.util.Optional;

public class Engine {
	
	private String name;
	private String model;
	private Optional<SpeedCC> cc;
	
	
	public Engine(String name, String model, Optional<SpeedCC> cc) {
		this.name = name;
		this.model = model;
		this.cc = cc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Optional<SpeedCC> getCc() {
		return cc;
	}
	public void setCc(SpeedCC cc) {
		this.cc = Optional.ofNullable(cc);
	}
	
	
	
}
