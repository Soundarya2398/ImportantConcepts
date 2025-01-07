package com.designPattern.programms;

public class SingletonLazy {
	static private SingletonLazy lazy;
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getObject() {
        System.out.println("Thread: " + Thread.currentThread().getName() + " is executing.");
        
//        try {
//            Thread.sleep(1000); // 100ms delay
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

		
		synchronized (SingletonLazy.class) {
			
			if(lazy==null) {
	            System.out.println("Creating a new Singleton instance by Thread: " + Thread.currentThread().getName());

				lazy=new SingletonLazy();
			}else {
            System.out.println("Creating a new Singleton instance by Thread: " + Thread.currentThread().getName());
			}
	        System.out.println("Thread: " + Thread.currentThread().getName() + " Instance HashCode: " + lazy.hashCode());


			
		}
		
		return lazy;
		
	}

}
