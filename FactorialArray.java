package shalini;

import java.util.Scanner;

public class FactorialArray {
	private int[] element=new int[10];
	private int[] factorials=new int[10];
	private int n;
	public int[] findFactorialValue(int[] numbers)
	{
		for(int k=0;k<numbers.length;k++)
		{
			int fact=1;
			for(int j=1;j<=numbers[k];j++)
			{
				fact=fact*j;
			}
			factorials[k]=fact;
			}
		
	return factorials;
	
	}


	public static void main(String[] args) {
		FactorialArray fa=new FactorialArray();
		int[] elements=new int[10];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter an element:");
			elements[i]=scan.nextInt();
		}
		
		int[] result=fa.findFactorialValue(elements);
		for(int i=0;i<n;i++)
		{
			System.out.println(result[i]);
		}
		}
}

	


