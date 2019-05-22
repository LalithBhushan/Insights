package com.dr.java8;

public interface DefaultInterfaceTwo  {

	public default void methodOne() {
		System.out.println("This IS the implementation of the method one in default interface 2");
	}
}
