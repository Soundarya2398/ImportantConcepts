package com.java8.programms;


import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChar {
	public static void main(String[] args) {
		
	
	//print frequency of character
	String str="asdfgerr";
	Map<Character,Long> ch=str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(ch);
	
	//print Duplicate
	Set<Entry<Character, Long>> entry=ch.entrySet();
	entry.stream().filter(e-> e.getValue()>1).forEach(i->System.out.print(i.getKey()+" "+i.getValue()));

}
}
