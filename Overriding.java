package com.redington.java.oops;


class Animal
{
	void a()
	{
		System.out.println("im am AAA");
	}
	void ab()
	{
		System.out.println("im am AB");
	}
}
class Dog extends Animal
{
	void a()
	{
		System.out.println("im am BBB");
	}
}
class Cat extends Animal
{
	void a() 
	{
		System.out.println("im am CCC");
	}
}
public class Overriding
{
	public static void main(String[] args) 
	{
	Cat c1= new Cat();
	c1.a();
	c1.ab();

	}
}	



