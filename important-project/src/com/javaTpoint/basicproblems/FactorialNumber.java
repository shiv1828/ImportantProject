package com.javaTpoint.basicproblems;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 9;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of 9 is" + " " + fact);
	}

}
