package com.gk.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(4);
		list.add("gk");
		// so type safety is missing if u dont specify generics,
		// so that we can add anything to a list and later if u push this data
		// to a int varible as for(int i : list)
		// i.e. assigning to int, it throws an exception as string cannot be
		// assigned to int variable.
		// but if u look the below code, generics eliminates this as given
		// below.

		List<Integer> myIntList = new ArrayList<Integer>();
		myIntList.add(44);
		myIntList.add("G");// error, becasue only Integer types are allowed to
							// this list.
		// so that it ensures type safety.
	}

}
