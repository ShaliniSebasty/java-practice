package shalini;

import java.util.Scanner;

public class DecArray {
	int[]  n=new int[5];
	int[]  asc=new int[5];
	int[]  dec=new int[5];
	Scanner scan =new Scanner(System.in);
	void getInput()
	{

		for(int i=0;i<5;i++)
		{
			System.out.println("enter the number");
			n[i]=scan.nextInt();
			asc[i]=n[i];
			dec[i]=n[i];
		}
	}

	void calc()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(asc[i]>asc[j])
				{
					int temp=asc[i];
					asc[i]=asc[j];
					asc[j]=temp;
					
				}
			}
			
		}
		//System.out.println(asc[j]);
	}
	
	void find()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(dec[i]<dec[j])
				{
					int temp=dec[i];
					dec[i]=dec[j];
					dec[j]=temp;
					
				}
			}
			
		}
		//System.out.println(asc[j]);
	}
	
	void print()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(asc[i]);
			
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(dec[i]);
		}
		
	}
	public static void main(String[] args) {
		
		DecArray dc=new DecArray();
		dc.getInput();
		dc.calc();
		dc.find();
		dc.print();
		
	}

}
