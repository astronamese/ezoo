package main;

import model.AwesomePerson;
import model.ReallyAwesomePerson;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AwesomePerson myAP = new AwesomePerson();
		myAP.talk();
		
		ReallyAwesomePerson myRAP = new ReallyAwesomePerson();
		myRAP.talk();
	}

}
