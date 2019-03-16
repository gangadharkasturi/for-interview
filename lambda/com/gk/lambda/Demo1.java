package com.gk.lambda;

/**
 * @author Kasturi's
 */

@FunctionalInterface
interface myInterface{
	public String sayHello();
	
}
public class Demo1 {
	public static void main(String[] args) {
		
		myInterface myInt = () -> {
			
			return "Gangadhar";
			
		};
		System.out.println(myInt.sayHello());

	}
}
