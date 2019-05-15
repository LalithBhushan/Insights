package com.dr.java8;
abstract class AnonymousDemo {
	
	abstract void add(int x,int y);
	

}

interface LamdaDemo{
	void cal(int a, int b);
}

public class Anonymous {
	
	
	public static void main(String[] args)
	
	
	{
		LamdaDemo l=(int a,int b)->System.out.println(a*b);
		AnonymousDemo d=new AnonymousDemo() {

			@Override
			void add(int x, int y) {
				int c=x+y;
				System.out.println(c);
			}
			
			
		};
		d.add(100,200 );
		l.cal(100, 200);
		
			
	}
}
	
