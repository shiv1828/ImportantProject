package com.javaTpoint.basicproblems;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n = 371;
		int temp = n;
		int r, sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r * r * r;
		}
		if (temp == sum) {
			System.out.println("it is a Armstrong Number");
		} else {
			System.out.println("it is not a Armstrong Number");
		}
	}

}
