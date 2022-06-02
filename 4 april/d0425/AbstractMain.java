package d0425;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent gp = new Child();
		gp.name = "gpa";
		gp.test();
		Child c = new Child();
		c.name = "momo";
		c.hobby="study";
		c.test();
	}

}
abstract class GrandParent
{
	protected String name = "";
	protected int age = 0;

	GrandParent() {
		System.out.println("grand");
	}
	public abstract void prt();
	public abstract void test();

}

abstract class Parent extends GrandParent
{
	Parent()
	{
		System.out.println("parent");
	}
	public void prt()
	{
		System.out.println("parent");
		System.out.println(name);
	}
}
class Child extends Parent
{
	public String hobby = "";
	Child()
	{
		System.out.println("child");
	}
	public void prt()
	{
		System.out.println("child");
		System.out.println(name);
		System.out.println(age);
	}
	public void test()
	{
		System.out.println("hobby="+hobby);
	}
	public void parentPrint()
	{
		super.prt();
	}
	
}