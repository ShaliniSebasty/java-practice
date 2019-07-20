package com.redington.java.oops;

import java.util.Scanner;

public class Alphabets {

	char n;
	void calc()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(n++);
		}
	}
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the char");
		 char n =scan.next().charAt(0);
		
		Alphabets a=new Alphabets();
		a.calc();
	}

}
