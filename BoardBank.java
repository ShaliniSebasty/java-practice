package com.redington.java.oops;

public class BoardBank {
	String name="kvb";
public static void main(String[] args) {
		
		UPI p=new UPI();
		p.print();
	}
}
class UPI extends BoardBank {
	
	String name="Paytm";
	void print()
	{
		String name="ABC";
		System.out.println(name);
		System.out.println(this.name);
	}
	

}
