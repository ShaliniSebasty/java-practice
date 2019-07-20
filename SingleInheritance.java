package com.redington.java.oops;
class A{
int a=1;
void first()
{
	System.out.println(a);
	}
}
class B extends A
{
int b=2 ;
void second()
{
	System.out.println(b);
	}
}

public class SingleInheritance  {

	public static void main(String[] args) 
	{
		B b=new B();
		b.second();
                                                                               
	}

}
