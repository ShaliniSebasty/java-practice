package shalini;

import java.util.Scanner;

public class ElementAndFactorial {
	
int[] num = new int[5];
int[] number=new int[5];
int i;
Scanner scan =new Scanner(System.in);
void input(){
	
	System.out.println("enter the number");
	for (i=0;i<=4;i++)
	{
       num[i]=scan.nextInt();
	}
}
void   find(){
	for(i=0;i<=4;i++)
	{
		
	int fact=1;
		
	for ( int j=1;j<=num[i];j++)
	
		{
	    fact=fact*j;
	    number[i]=fact;
	    }
	
	//System.out.println(fact);
	System.out.println(number[i]);
	}

}

	
	public static void main(String[] args) {
		
		ElementAndFactorial ef=new ElementAndFactorial();
		ef.input();
		ef.find();
	}

}
