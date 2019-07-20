package com.redington.java.oops;

import java.util.Scanner;

public class AddAverage {
	int n;
	char c;
	char q;
void calculate()
{
	Scanner scan =new Scanner(System.in);

	char c = scan.next().charAt(0);
    int sum = 0;
    float Average = 0;
    int i =0;
    for(i=0;i<n;i++)
    {
        sum=sum+n;
    	i++;
    	Average =sum /i;
    		}
	if(c!=q)
	{
	
	System.out.println("enter the n value");
    n=scan.nextInt();
    
	}
    	else
    	{
    	
        	System.out.println (sum );
        	System.out.println(Average);
        	
        
    	}
    }


	public static void main(String[] args) {
		
		AddAverage ad=new AddAverage();
		ad.calculate();
	}

}
