package com.java8.programms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,90,2,1,2,3,8);
		list.stream().distinct().forEach(i->System.out.print(i+" "));

	}

}
