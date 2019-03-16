package com.tricky;

public class SwapWithoutTemp {
public static void main(String[] args) {
	int a = 500;
	int b = 400;
	System.out.println("Before Swap : a,b: " +a +" "+b);
	a = a+b;//900
	b = a-b;//900-400 =500
	a = a - b;
	System.out.println("After Swap : a,b: " +a +" "+b);
	
	
}
}
