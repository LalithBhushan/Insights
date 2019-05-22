package com.dr.java8;

public class Without_Extending_Class_ImplementsTwoInterfaces implements DefaultInterfaceOne,DefaultInterfaceTwo{

	
	public void methodOne() {
		DefaultInterfaceOne.super.methodOne();
	}
	public static void main(String[] args)
	{
		new Without_Extending_Class_ImplementsTwoInterfaces().methodOne();
	}
}
