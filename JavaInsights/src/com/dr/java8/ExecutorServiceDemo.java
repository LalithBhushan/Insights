package com.dr.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorServiceDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("ThreadName: "+Thread.currentThread().getName());
	}

	public void main(String[] args)
	{
		System.out.println("ThreadNmae: "+Thread.currentThread().getName());
		
		
		//creating new ThreadPool
		ExecutorService service= Executors.newFixedThreadPool(10);
		
		for(int i=0;i<100;i++)
		{
		service.execute(new ExecutorServiceDemo());
		}
	
	}
}


