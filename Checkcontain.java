package shalini;

import java.util.Scanner;

public class Checkcontain {
	String s=new String("green card");
	void contain(){
		/*Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		s=scan.next();
		*/
	System.out.println(s.contains("green"));
	}

	public static void main(String[] args) {
		
		Checkcontain cc=new Checkcontain();
		cc.contain();
	}

}
