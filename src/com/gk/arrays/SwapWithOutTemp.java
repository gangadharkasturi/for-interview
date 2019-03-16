package com.gk.arrays;

public class SwapWithOutTemp {
	public static void main(String[] args) {
		int a = 800;
		int b = 200;

		a = a + b;// 700
		b = a - b;// 500
		a = a - b;//200

		System.out.println("a:" + a + "\n" + "b:" + b);
	}
}
