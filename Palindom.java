package com.redington.java.oops;

public class Palindom {

	
		 public static void main(String[] args) 
			{
				int f=0,s=1;
				System.out.println(f);
				System.out.println(s);
				int count=5;
				while(count>0)
				{
					s=f+s;
					f=s-f;
					System.out.println(s);
					count--;
				}
			 }
		}