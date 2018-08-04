package model;

public class AwesomePerson extends Person {
	public AwesomePerson() {
		this.name = "Nick";
		this.age = 23;
	}
	
	public void talk() {
		System.out.println("Name: " + name + " and Age: " + age);
	}
}
