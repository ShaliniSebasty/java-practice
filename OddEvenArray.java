package shalini;

import java.util.Scanner;

public class OddEvenArray {
	int[] num=new int[5];
	int[] even=new int[5];
	int[] odd=new int[5];
	void getInput()
	{
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("enter n value");
			num[i]=scan.nextInt();
		}
	}
	void calc()
	{
		//int count=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0 ; j<=num[i];j++){
			if(num[i] % 2==0)
			{ 
				//count++;
				even[i]=num[i];
			}
			else if (num[i] % 2 !=0)
				
			{
				//count++;
				odd[i]=num[i];
				
			}
		}
	}
	
	void diplay()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("even numbers:" + even[i]);
			System.out.println("odd numbers:" + odd[i]);
		}
	}
		
	
	public static void main(String[] args) {
		

	}

}
