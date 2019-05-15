package com.dr.java8;

public class ThreadLamdaDemo   {

	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r=() ->
		{
			System.out.println("This is thread without run method");
		};
		
		
             Thread t=new Thread(r);
             Thread t2=new Thread(r);
             
             t.start();
             Thread.sleep(4000);
             t2.start();

	}

}
