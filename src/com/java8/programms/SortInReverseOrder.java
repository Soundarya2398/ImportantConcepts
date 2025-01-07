package com.java8.programms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));

	}

}
