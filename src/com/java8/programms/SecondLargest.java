package com.java8.programms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		int sl=list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(sl+" ");
	}

}
