package com.designPattern.programms;

public class SingletonLazyMain {

	public static void main(String[] args) {
		
		//SingletonLazy s1=SingletonLazy.getObject();
		//System.out.println(s1.hashCode());
		
		//SingletonLazy s2=SingletonLazy.getObject();
		//System.out.println(s2.hashCode());
		
		SingletonThread rob=new SingletonThread();
		Thread th1=new Thread(rob,"thread1");
		th1.start();
		
		Thread th2=new Thread(rob,"thread2");
		th2.start();

	}

}
