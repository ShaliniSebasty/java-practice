package shalini;

import java.util.Scanner;


public class Exercisearray {
/*int a[]={1,2,5,6,};
int b[]=new int[a.length];
void calc(){
	b=a;
	a[0]=20;

System.out.println(b[0]);*/
	char n[] =new char[3];
	char a[]=new char[3];
	Scanner scan =new Scanner(System.in);
	void calc()
	{
		System.out.println("enter the char");
		
	for(int i=0;i<3;i++){
		n[i]=scan.next().charAt(0);
		a[i]=n[i];
	}
			
	}
	
	void dis()	{
		
		for(int i=0;i<3;i++)
		{
			for(int j=i+1;j<3;j++)
			{
				//for(char k=0;k<=3;k++){
				if( a[i]<a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
	 }
	
	}		
		
		
void display()
{
	for(int i = 0;i<3;i++){
		System.out.println(a[i]);
	}
}
	public static void main(String[] args) {
		Exercisearray ea =new Exercisearray();
		ea.calc();
		ea.dis();
		ea.display();
	}

}
