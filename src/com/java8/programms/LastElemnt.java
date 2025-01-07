package com.java8.programms;

import java.util.Arrays;
import java.util.List;

public class LastElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		int l=list.stream().reduce((f,s)->s).get();
		System.out.println(l);

	}

}
