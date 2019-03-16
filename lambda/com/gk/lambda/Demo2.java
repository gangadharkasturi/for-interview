package com.gk.lambda;
/**
 * 
 * @author Kasturi's
 *
 */
@FunctionalInterface
interface MyInt {
	public String sayHello(String name);
}

public class Demo2 {
	public static void main(String[] args) {
		MyInt myIntrf = (name) -> {
			return name + "\t" + "gk";
		};
		System.out.println(myIntrf.sayHello("hp"));
	}

}
