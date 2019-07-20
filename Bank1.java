package com.redington.java.oops;

 class Bank1{
 Bank1(int a)
 {
	 System.out.println("A");
 }
	 public static void main(String[] args) {
			Paytm p=new Paytm();
		}

 
 }

 class Paytm extends Bank1{
	 
		Paytm()
	 {
			super(5);
		 System.out.println("B");
	 }
 }
 


