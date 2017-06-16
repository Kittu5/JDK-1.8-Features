package com.kittu.core.methodInterface;

public class MethodInterfaceExample1 {

	/*
	 * Java 8 Method reference is used to refer method of functional interface .
	 * It is compact and easy form of lambda expression. Each time when you are
	 * using lambda expression to just referring a method, you can replace your
	 * lambda expression with method reference.
	 * 
	 * There are four types of method references: 1) Reference to a static
	 * method. 2) Reference to an instance method of a particular object. 3)
	 * Reference to an instance method of an arbitrary object of a particular
	 * type. 4) Reference to a constructor. *
	 * 
	 */

	public void printnMsg() {
		System.out.println("Hello, this is instance method");
	}

	public static void main(String[] args) {

		Thread t2 = new Thread(new MethodInterfaceExample1()::printnMsg);
		t2.start();

	}

}
