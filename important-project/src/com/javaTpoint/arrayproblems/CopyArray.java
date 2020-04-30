package com.javaTpoint.arrayproblems;

public class CopyArray {

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 3, 4, 5 };
		int[] array2 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array2 = array1;
			System.out.print(array2[i]);
		}

	}

}

