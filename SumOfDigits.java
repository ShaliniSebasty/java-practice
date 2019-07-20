package com.redington.java.oops;

import java.util.Scanner;

public class SumOfDigits
{
	int[] n=new int[5];
	int a=0;
public void get()
	
{  for(i=0;i<n[i];i++) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the n value");
    n[i]=scan.nextInt();
}
   void calc(){
	  for(i=0;i<n[i];i++) 

    while(n>0)
    {
	int rem =n%10;
	a=a+rem;
	n=n/10;
    }	
   System.out.println(a);
}

	public static void main(String[] args)
	{
		SumOfDigits sd=new SumOfDigits();
		sd.get();

	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
}


