package com.mycompany.main;

public class StaticClass {
	public static double num1;
	public static double num2;
	
	public StaticClass() {
	}
	
	public static void sum(double num1, double num2) {
		double numsum = num1 + num2;
		System.out.println(numsum);
	}
}
