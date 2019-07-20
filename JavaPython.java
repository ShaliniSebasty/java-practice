package com.redington.java.oops;

import java.util.Scanner;

public class JavaPython {
	String n1;
	String n2;
	
 void display()
 {
	 Scanner scan= new  Scanner(System.in);
	 System.out.println("Enter the string1");
	  n1= scan.next();
	  System.out.println("Enter the string2");
	  n2= scan.next();
	  System.out.println(n1+n2);
	 
 }
	

	public static void main(String[] args) {
		
		JavaPython jp=new JavaPython();
		jp.display();
	}

}
