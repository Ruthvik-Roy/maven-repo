package com.lti;

public class Calc {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int subs(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int prod(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int div(int num1, int num2) {
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum is : "+add(10, 20));
		System.out.println("Difference is : "+subs(40, 20));
		System.out.println("Product is : "+prod(10, 20));
		System.out.println("Division is : "+div(200, 20));
	}

}
