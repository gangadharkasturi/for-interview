package com.gk.arrays;

public class ArrySortWithoutPredefined {
	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 2, 33, 4, 65, 87 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
