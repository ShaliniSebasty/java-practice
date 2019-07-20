package com.redington.java.oops;

import java.util.Scanner;

public class BasicArray
{
	int[] marks=new int[3];
public void getInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the numbers");
		for(int i=0;i<3;i++)
		{
			
			marks[i]=scan.nextInt();
		}
	
		//int i = 0;
		//return marks[i];
	}

/*public void getOutput()
{
	for(int i=0;i<10;i++)
	{
		System.out.println(marks[i]);
	}
}*/
public void add()
{
 int add=0;

for(int i=0;i<3;i++)
{
	//System.out.println(add=marks[i]);
	//int i1 = 0;
	add = add+ marks[i];
}
System.out.println(add);
//return add;

}


	public static void main(String[] args) 
	{
		BasicArray ba =new BasicArray();
        ba.getInput();
        ba.add();
	}

}
