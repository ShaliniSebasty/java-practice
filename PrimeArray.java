package shalini;

import java.util.Scanner;

public class PrimeArray {
int[] n=new int[5];
int[] primenumber=new int[5];
int startno,endno;
public void getInput()
{
	Scanner scan=new Scanner(System.in);
	{
		System.out.println("enter the starting  numbers:");
        startno=scan.nextInt();
        System.out.println("enter the ending  numbers:");
        endno=scan.nextInt();
	}    
	}
void calculate()
{
	int count=0;
	int check=0;
	for(int i = startno;i<endno;i++)
	{
		for(int n =2;n<i;n++)
	
	{
		if(n%2==0)
			{
			check=1;
		    }
		
	}
	if(check==0)
	{
		count++;
		primenumber[count]=1;
		System.out.println(primenumber[count]);
	}
}
}
	public static void main(String[] args) {
		
		PrimeArray  pa=new PrimeArray ();
		pa.getInput();
	    pa.calculate();

}
}
