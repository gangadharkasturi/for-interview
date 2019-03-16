package com.gk.lambda;

/**
 * 
 * @author Kasturi's
 *
 */
@FunctionalInterface
interface GkInterface {

	public String nameTest(String name, int age);

}

@FunctionalInterface
interface TestInterface{
	public int ageTest(int age);
}

public class Demo3 {
	public static void main(String[] args) {

		GkInterface gkInterface = (name, age) -> {
			return name + age;

		};

		System.out.println(gkInterface.nameTest("Gangadhar", 225));
		
		TestInterface testInterface = (ageNumber) -> ageNumber+22;
		
		System.out.println(testInterface.ageTest(20));

	}

}
