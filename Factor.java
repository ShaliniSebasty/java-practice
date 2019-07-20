package com.redington.java.oops;

import java.util.Scanner;

public class Factor {
	int n;
	
	void display()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the n value");
		n = scan.nextInt();
		int a = 0;
		for(int i = 1;i<n;i++)
		{
			
		//a=n%i;
		//System.out.println(a);
		
		if(n%i==0)
		{
			System.out.println(i);
		}
	}
}
	

	public static void main(String[] args) {
		Factor f=new Factor();
		f.display();

	}

}
