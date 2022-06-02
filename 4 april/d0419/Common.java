package d0419;

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV btv = new TV();
		btv.turnOn();
		
	}
	

}

class Product
{
	int no;
	int name;
	
	Product()
	{
		
	}
	Product(int no, int name)
	{
		this.no = 33;
		this.name = 6;
	}
	void turnOn()
	{
		System.out.println("on");
	}
	void turnOff()
	{
		System.out.println("off");
	}
	
}

class TV extends Product
{
	int no;
	int channel;
	int inch;
	
	{
	System.out.println(super.no);
	super.no=77;
	System.out.println(super.no);
	}
	TV()
	{
		super.no = 6;
		this.no = super.no;
		
		System.out.println("tvd");
	}
	TV(int channel, int inch, int no, int name)
	{
		super(no, name);
		this.no = no;
		this.name = name;
		
	}
}

class Computer extends Product
{
	
	Computer()
	{
		System.out.println("com");
	}
}