package shalini;

import java.util.Scanner;

public class Posneg_oddeven {
	int[] number1= new int[5];
	int i,n;
	int count=0;
	int count1=0;
	int count2=0;
	int count3=0;
	int count4=0;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println("==============================");
		for(i=0;i<5;i++)
		{
			number1[i]=scan.nextInt();
		}
	}
	void evenorodd_numb()
	{
		
	
		for(i=0;i<5;i++)
		{
			if(number1[i]%2==0)
			{
				count = count+1;
			}
			else
			{
			  count1 = count1+1;
			}
		}
		System.out.println("even numbers comes" + count + "times");
		System.out.println("odd numbers comes" + count1 +"times");
	}
void posnegative()
{
	
	for(i=0;i<5;i++)
	{
		if(number1[i]==0)
		{
			count2=count2+1;
		}
		else if(number1[i]>0)
		{
			count3=count3+1;
			
		}
		else 
		{
			count4=count4+1;
		}
		
	}
	System.out.println("positive numbers comes" +count3 + "times");
	System.out.println("negative numbers comes" +count4 +"times");
}
	public static void main(String[] args) {
		Posneg_oddeven  ps=new Posneg_oddeven ();
		ps.getInput();
		ps. evenorodd_numb();
        ps.posnegative();
	}

}
