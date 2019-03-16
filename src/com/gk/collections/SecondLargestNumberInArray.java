package com.gk.collections;

public class SecondLargestNumberInArray {
	public static void main(String[] args) {
		int num[] = { 11, 7, 88, 74, 7, 5, 66, 99, 88, 77, 44, 11, 22, 543 };
		int max1 = num[0];// assuming its first highest
		int max2 = 0;
		for (int i = 1; i < num.length; i++) {// we are comparing from second
			// position of the array as the
			// first positioni is already
			// loaded into max.
			if (max1 < num[i]) {
				max2 = max1;
				max1 = num[i];

			}

		}
		System.out.println("First Highest:" + max1 + "\n" + "Second Highest:" + max2);
	}
}
