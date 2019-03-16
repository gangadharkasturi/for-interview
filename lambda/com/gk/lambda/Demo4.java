package com.gk.lambda;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("Glenn");
		list.add("Carl");
		
		list.forEach(names -> System.out.println(names));
		
		/*for(String name : list)
		{
			System.out.println(name);
		}*/
	}
}
