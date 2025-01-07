package com.java8.programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SeperateOddEven {

	public static void main(String[] args) {
		
				List<Integer> list=new ArrayList<Integer>();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size till how much we can except the input");

				int size=sc.nextInt();
				System.out.println("Enter the elements in the list which you want to seperate odd and even ");
				for(int i=0;i<size;i++) {
					int number=sc.nextInt();
					list.add(number);
				}
		
		
		Map<Boolean, List<Integer>> map=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
		List<Integer> even=map.get(true);
		List<Integer> odd=map.get(false);
		System.out.print("even Numbers are: "+" "+ even);
		System.out.print("odd Numbers are: "+" "+ odd);
		

	}

}
