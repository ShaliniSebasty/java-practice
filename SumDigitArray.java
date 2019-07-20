package shalini;

import java.util.Scanner;

import com.redington.java.oops.SumOfDigits;

public class SumDigitArray

{
	int i;
	int[] n = new int[5];
	int[] a = new int[5];

	void get()

	{
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {

			System.out.println("enter the n value");
			n[i] = scan.nextInt();
		}
		while (n[i] > 0) {
			int rem = n[i] % 10;
			a[i] = a[i] + rem;
			n[i] = n[i] / 10;
		}

	}

	void display() {
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		SumOfDigits sd = new SumOfDigits();
		sd.get();
		sd.display();
	}
}
