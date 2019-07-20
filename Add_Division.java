package com.redington.java.oops;

import java.util.Scanner;

public class Add_Division{
int n;
int a=0;
//int temp=n;
void get()
{   
Scanner scan =new Scanner(System.in);
System.out.println("enter the value");
n=scan.nextInt();
 int temp=n;

while(n>0)
{
int rem =n%10;
a=a+rem;
n=n/10;
}	
System.out.println(a);

if(temp%n==0)
{
 System.out.println("Output:Yes");
}
else
{
 System.out.println("Output:No");
}
}
}



	


