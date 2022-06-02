package d0422;

public class Supermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperParent sp = new SuperChild();
		sp.prt();
	}

}

class SuperParent
{
	protected int a = 10;
	
	public void prt()
	{
		System.out.println("SuperParent");
		System.out.println("a="+a);
	}
}
class SuperChild extends SuperParent
{
	private int a = 20;
	public void prt()
	{
		System.out.println("Superchild");
		System.out.println("a="+a);
		SuperCall();
	}
	public void SuperCall()
	{
		System.out.println("super.a="+super.a);
		super.prt();
	}
}