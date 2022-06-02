package d0420;

public class ParentM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child c = new Child();
		c.name = "dd";
		c.age = 200;
		c.prt2();
	}

}

class Grandp
{
	Grandp()
	{
		System.out.println("Grandp");
	}
	
	void prt3()
	{
		System.out.println("bar");
	}
}

class Parent extends Grandp
{
	String name;
	protected int age;
	private int money;
	
	protected Parent()
	{
		System.out.println("Parent");
	}
	void prt2()
	{
		prt3();
		System.out.println("bbar");
	}
}

class Child extends Parent
{
	private String hobby;
	
	public Child()
	{
		System.out.println("Child");
	}
	void prt2()
	{
		
		System.out.println("yee");
	}
}