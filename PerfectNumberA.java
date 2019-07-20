package shalini;

import java.util.Scanner;

public class PerfectNumberA {
	int[] number=new int[5];
	int[] sum=new int[5];
void getInput()
{
	Scanner scan =new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter the number:");
		number[i]=scan.nextInt();
	}
}
void  calc()
{
	for(int i=0;i<5;i++)
	{
		for(int j = 1;j<number[i];j++)
		{
			if(number[i] % j==0)
			{
				sum[i]=sum[i]+j;
			}
		}
	}
	//return sum[i];
}
void display()
{
	for(int i=0;i<5;i++)
	{
	if(sum[i]==number[i])
		{
			System.out.println("its perfect num");
		}
   else
   {
	   System.out.println("its  not perfect num");	
			
   }
   }
}
public static void main(String[] args) {
		PerfectNumberA  pn=new PerfectNumberA ();
		pn.getInput();
		pn.calc();
		pn.display();
	}

}
