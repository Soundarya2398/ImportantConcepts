package com.designPattern.programms;

public class SingletonEagerMain {

	public static void main(String[] args) {
		
		SingletonEager e1=SingletonEager.getObject();
	
		System.out.println(e1.hashCode());

		
		SingletonEager e2=SingletonEager.getObject();
		
		System.out.println(e2.hashCode());
	}

}
