package com.redington.java.oops;

import java.util.Scanner;

public class GivenCharacter {
char n;
	
void getInput(){
	Scanner scan =new Scanner(System.in);
	System.out.println("enter n:");
	n=scan.next().charAt(0);
	{
	//char n;
	
	if(n>='A' &&n<='Z')
	{
		System.out.println("upper case");
	}
	else if (n>='a' &&n<='z'){
		System.out.println("lower case");
	}
 
	else if (n>='0'&&n<='9'){
		System.out.println("number");
	}
	else
	{
		System.out.println("Special character");
		
	}
	}
}

	public static void main(String[] args) {
		
		GivenCharacter gc=new GivenCharacter();
		gc.getInput();
	}

}
