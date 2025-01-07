package com.designPattern.programms;

public class SingletonThread implements Runnable{

	@Override
	public void run() {
SingletonLazy.getObject()	;	
	}

}
