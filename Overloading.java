package com.redington.java.oops;

public class Overloading
{
  int add(int a,int b)
       {
	int c=a+b;
	System.out.println("sum of two variables " + c);
	return c;

}
  int add(int a,int b,int c)
{
int d=a+b+c;
System.out.println("sum of two variables " + c);
return d;
}
	public static void main(String[] args) {
	Overloading obj =new Overloading ();
	obj.add(4,6);
	obj.add(2,5,8);

	}

}
