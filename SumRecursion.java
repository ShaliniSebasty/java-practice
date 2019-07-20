package shalini;

import java.util.Scanner;

public class SumRecursion {
	int[] n= new int[4];
	int sum=0;
	int i =0;
	Scanner scan= new Scanner(System.in);
	void calc()
	{
		System.out.println("enter the numbers");
		for(i=0;i<4;i++)
		{
		 n[i] = scan.nextInt();
		}
		}
  //  int sum = 0;
   // for(i=0;i<n[i];i++)
	void find(){
		//	for(i=0;i<4;i++)
			//{
	if(i<n.length)
    {
        sum=sum+n[i];
    	i++;
    	calc();
    	//System.out.println(i);
    }
			
	}
	void dis()
	{
		System.out.println(sum);
	}
	public static void main(String[] args) {
		SumRecursion sc=new SumRecursion();
		sc.calc();
		sc.find();
		sc.dis();

	}

}
