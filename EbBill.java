package com.redington.java.oops;

import java.util.Scanner;

public class EbBill {
	int unit;
	Scanner scan=new Scanner(System.in);
void getInput()
{
	System.out.println("Enter the unit");
	if(unit<=100)
	{
		int Total = unit * 5;
		System.out.println("Total is" + Total);
	}
	if(unit<=200)
	{
		int Total = (unit-100) * 7+100*5;
		System.out.println("Total is" + Total);
	}if(unit<=300)
	{
		int Total = (unit-200) * 10+100*7+100*5;
		System.out.println("Total is" + Total);
	}if(unit>300)
	{
		int Total = (unit-300)*15+100* 10+100*7+100*5;
	    System.out.println("Total is" + Total);
	}
}

	public static void main(String[] args) {
		
		boolean b= true;
		while(b)
		EbBill eb=new EbBill();
		eb.getInput();
		
	}

}
