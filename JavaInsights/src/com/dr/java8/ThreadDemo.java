package com.dr.java8;

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
	System.out.println("SubThread"+" "+Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("MainThread"+" "+Thread.currentThread().getName());
		for(int i=0;i<=10;i++)
		{
		Thread t=new Thread(new ThreadDemo());
		t.start();
		}
	}

}
