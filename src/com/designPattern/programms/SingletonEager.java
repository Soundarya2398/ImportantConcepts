package com.designPattern.programms;

public class SingletonEager {
	
	private static SingletonEager eager=new SingletonEager();
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getObject() {
		return eager;
	}

}
