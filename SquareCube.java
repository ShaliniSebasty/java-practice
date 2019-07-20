package com.redington.java.oops;

import java.util.Scanner;

public class SquareCube
{
	int n;
	void display()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter n value");
		n=scan.nextInt();
		Math.sqrt(n);
		//return n;
		//System.out.println(n);
	}

	public static void main(String[] args) {
		
		SquareCube sc=new SquareCube();
		//int num =
		sc.display();
		
	}

}
