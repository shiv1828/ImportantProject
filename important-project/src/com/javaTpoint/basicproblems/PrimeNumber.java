package com.javaTpoint.basicproblems;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 508;
		boolean isPrime = true;
		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num +" "+ "is a prime number");
		} else {
			System.out.println(num +" "+ "is not a prime number");
		}
	}
}
