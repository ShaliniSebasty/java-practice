package com.redington.java.oops;

import java.util.Scanner;

public class PrimeOrNot {
	int n;
public void getInput(){
	

     Scanner scan =new Scanner(System.in);
      System.out.println("enter n value");
      n=scan.nextInt();
}
void PrimeCheck()
{ 
	int check=0;
	for(int i=2;i<n;i++)
	{ 
		if(n%i==0){
			check=1;
			//System.out.println( "n is :"+n+ "i is :"+i);
			break;
		}
		
	}
	if(check==0)
		
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println(" not prime number");
	}
	}
public static void main(String[] args) {
	
	PrimeOrNot pn= new PrimeOrNot();
	pn.getInput();
	pn.PrimeCheck();
    System.out.println(args[0]);

	}

}
