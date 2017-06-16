package com.kittu.core.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("krishna");
		list.add("anji");
		list.add("laxman");
		list.add("jai");

		list.forEach((p) -> System.out.println(p));

	}

}
