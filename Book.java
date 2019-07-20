package shalini;

 class Book1 {
	int price=34;
	String name="";
	public String author;
}
class Computer
{
	int ram=2;
	int getSpeed()
	{
		int timeclock=2;
		int speed=timeclock*ram;
		return speed;
	}
	Book1 getAction()
	{

		Book1 tamil=new Book1();
		tamil.price=50;
		tamil.author="bharathi";
		return tamil;
	}
	public class Book
	{
		public void main(String []args)
		{
			Computer c=new Computer();
			int k=c.getSpeed();
			Book1 book=c.getAction();
			System.out.print(book.author);
			
		}
	}
}
