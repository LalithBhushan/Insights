package com.dr.java8;

public class StaticAndDefaultClass implements StaticAndDefault {

//	  public void defaultMethod() {
//		System.out.println("This is overided default method");
//	}

	public   static void staticMethod()
	  {
		  System.out.println("This is overided Static method");
	  }
	public static void main(String[] args) {
		
StaticAndDefaultClass sdc=new StaticAndDefaultClass ();
sdc.defaultMethod();
StaticAndDefaultClass.staticMethod();
	}

}
