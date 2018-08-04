package model;

public class ReallyAwesomePerson extends AwesomePerson {
	public ReallyAwesomePerson() {
		this.name = "Cynthia";
		this.age = 21;
	}
	
	public void talk() {
		System.out.println(name + " is really awesome.");
	}
}
