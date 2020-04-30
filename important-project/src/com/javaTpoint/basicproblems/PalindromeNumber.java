package com.javaTpoint.basicproblems;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n = 14341, r, s = 0;
		int t = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = s * 10 + r;
		}
		if (t == 0) {
			System.out.println("it is not a palimdrome number");
		} else {
			System.out.println("it is a palindrome number");
		}
	}

}