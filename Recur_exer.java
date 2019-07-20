package shalini;

public class Recur_exer {
	int a=1;
void get()
{
	System.out.println(a);
	if(a<5){
		a++;
		get();
	}
	System.out.println(a);
	
}
	public static void main(String[] args) {

		 Recur_exer r= new Recur_exer();
		 r.get();
	}

}
