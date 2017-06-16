package com.kittu.core.lambda;

public class LambdaExample1 {

	public static void main(String[] args) {
		/*
		 * Lambda expression helps us to write our code in functional style. It
		 * provides a clear and concise way to implement SAM interface(Single
		 * Abstract Method) by using an expression. It is very useful in
		 * collection library in which it helps to iterate, filter and extract
		 * data.
		 * 
		 * Java Lambda Expression Syntax: (argument-list) -> {body}
		 * 
		 * 1) Argument-list: It can be empty or non-empty as well. 2)
		 * Arrow-token: It is used to link arguments-list and body of
		 * expression. 3) Body: It contains expressions and statements for
		 * lambda expression.
		 * 
		 */

		int width = 10;

		// with lambda
		LambdaInterfaceDrawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
	}

}
