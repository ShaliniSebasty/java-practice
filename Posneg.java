package shalini;

import java.util.Scanner;

public class Posneg {
	int i;
int[] numb =new  int[5];
Scanner scan=new Scanner(System.in);
 void getInput(){
	 System.out.println("enter the 5 values");
	 for(i=0;i<5;i++)
	 {
		 
         numb[i]  =scan.nextInt();
	 }
	 }
             
  void calc()
      {
	for(i=0;i<5;i++)
	{
		if(numb[i]>=0)
		{
			System.out.println("The number" + numb[i] + "is positive");
		}
		else
		{
			System.out.println("The number" + numb[i] + "is negative");
		}
	}
}

	public static void main(String[] args) {
	Posneg pn=new Posneg();
	pn.getInput();
    pn.calc();
	}

}
