package com.redington.java.oops;

import java.util.Scanner;

public class TaxableIncome {

	int taxableincome;
	double taxpayable;
	final double Tax_Rate_above20K=0.1;
	final double Tax_Rate_above40K=0.2;
    final double Tax_Rate_above60K=0.3;
    void calc()
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the taxable income:");
    	taxableincome=scan.nextInt();
    	if(taxableincome <=20000)
    	{
    		taxpayable=0;
    	}
    	else if(taxableincome <=40000)
    	{
    		taxpayable=(taxableincome-20000)*Tax_Rate_above20K;
    	}
    	else if(taxableincome <=60000)
    	{
    		taxpayable=(taxableincome-40000)*Tax_Rate_above40K+20000*Tax_Rate_above20K;
    	}
    	else
    	{
    		taxpayable=(taxableincome-60000)*Tax_Rate_above60K+ 20000 *Tax_Rate_above40K+20000*Tax_Rate_above20K;
    	}
    	System.out.println(taxpayable);
    }
	
	
	public static void main(String[] args) {
		
		TaxableIncome  tc=new TaxableIncome ();
		tc.calc();

	}

}
