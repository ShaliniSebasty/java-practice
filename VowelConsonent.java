package com.redington.java.oops;

import java.util.Scanner;

public class VowelConsonent
{
     char n;

 void find()
 {
    if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
    		{
    	      System.out.println("funny its  a vowel");
    	      
    		}
    else
       {
    	System.out.println("aww its a consonent");
	      
        }
 }

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
				System.out.println("enter n:");
		char c = scan.next().charAt(0);
		VowelConsonent vc =new VowelConsonent();
		vc.find();

	}

}
