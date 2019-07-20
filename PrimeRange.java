package com.redington.java.oops;

import java.util.Scanner;

public  PrimeRange {
	int o,s;
	
	public void getInput(){
			Scanner scan =new Scanner(System.in);
		      System.out.println("enter the start value");
		      o=scan.nextInt();
		      System.out.println("enter end value");
		      s=scan.nextInt();
		}
		void PrimeCheck()
		{ for( int j=o;j<=s;j++){
			
		int check=0;
		for(int i=2;i<j;i++)
		{ 
			if(j%i==0){
				check=1;
				//System.out.println( "n is :"+n+ "i is :"+i);
				//break;
			}
		}
		
		if(check==0)
			
		{
			System.out.println(j + " is aprime number");
		}
		else
		{
			System.out.println( j +"is  not a prime number");
		}
		}
		}
	public static void main(String[] args) {

		PrimeRange pn= new PrimeRange();
		pn.getInput();
		pn.PrimeCheck();
		 
	    System.out.println(args[0]);

		}

	}

	