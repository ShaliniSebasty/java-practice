package com.redington.java.oops;

public class AddingEven {
	void add() {

		//int even= 0;
		int odd= 0;
		for (int i = 1; i <= 10; i = i + 2)
		{

			//System.out.println( i);//for display of these numbers like 0,2,4,6,8,10
		
			// even=even + i;
			 odd=odd +i;
		}
		//System.out.println( even);
		System.out.println( odd);
		//return even;
		//return odd;
	}

	public static void main(String[] args) {

		AddingEven ae = new AddingEven();
		ae.add();
	}

}
