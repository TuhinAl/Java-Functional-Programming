package collections;

import java.util.List;

public class Worker {
	private String name;
	private int age;
	private List<Role> roles;
	
	public Worker(String name, int age, List<Role> roles) {
		this.name = name;
		this.age = age;
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	

}
