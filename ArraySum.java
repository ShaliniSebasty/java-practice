package shalini;

import java.util.Scanner;

public class ArraySum {
	int i,j,k,m;
	int[] numbers=new int[5];
	int sum=0;
	Scanner scan=new Scanner(System.in);
	void getInput()
	{
		
		System.out.println("enter the number:");
		for(i=0;i<=4;i++)
		{
			
		numbers[i]=scan.nextInt();
	
		}
		for(j=0;j<=4;j++)
		{
			System.out.println(numbers[j]);
		}
		for(k=0;k<=4;k++)
		{
			sum=sum+numbers[k];
		}System.out.println( "total is " +sum);
	}
	void countCheck()
	{
		System.out.println("enter n value");
		int num=scan.nextInt();
		int check = 0;
		int count=0;
		for(m=0;m<=4;m++){
		if(numbers[m]==num)
		{
			check=1;
			count++;
		}
		}
		if(check==1)
		{
			
			System.out.println("number founded");
			
		}
	System.out.println("founded number appeared " + count + " times");
	}
	void maximum()
	{
		int max=0;
		for(i=0;i<=4;i++)
		{
			if(numbers[i]>max)
			{
				max=numbers[i];
			}
		}System.out.println("gayu plz listen max number is " + max);
	}
	void minimum()
	{
		int min=numbers[0];
		for(i=0;i<=4;i++)
		{
			if(numbers[i]<min)
			{
				min=numbers[i];
			}
		}System.out.println("gayuuuma mini maaaaaaaeeee  " + min);
	}
	public static void main(String []args){
		 ArraySum  as= new ArraySum ();
		 as.getInput();
		 as.countCheck();
		 as.maximum();
		 as.minimum();
	}
}

