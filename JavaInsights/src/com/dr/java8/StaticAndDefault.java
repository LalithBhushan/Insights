package com.dr.java8;

public interface StaticAndDefault {
	
	public default void defaultMethod() {
		System.out.println("This is default method");
	}

	public static void staticMethod()
	{
		System.out.println("This is static method");
	}
	}

