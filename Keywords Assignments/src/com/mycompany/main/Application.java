package com.mycompany.main;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass.sum(11.1, 12.2);
		
		FinalClass myFC = new FinalClass();
		System.out.println(myFC.myConstant);
		
		ConcreteClass myCC = new ConcreteClass();
		myCC.run();
	}

}
