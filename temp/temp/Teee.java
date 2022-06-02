package temp;

public class Teee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		chd t = new chd(7);
		System.out.println(t.a);
		tv t1 = new tv();
		System.out.println(t1.a);
		t1.turn();
		System.out.println(t1.a);
	}

}

class Mem5 implements ani
{
	int a=4;
	String name;
	String tel;
	String add;

	Mem5(int a)
	{
		this.a=a;
	}
	
	public void cry()
	{
		System.out.println("d");
	}
	
	
}
class ea{
	int a = 4;
	void turn() {
		this.a=6;
	}
}
class tv extends ea{
	void turn() {
		this.a=6;
	}
}

class chd extends Mem5
{
	int b = 5;
	chd(int b)
	{
		super(8);
		b=66;
		a=64;
		System.out.println(b);
	}
}

interface ani
{
	void cry();
}