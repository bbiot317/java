package d0421;

public class UPM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UCP up = new UCC();
		UCC uc = new UCP();
		up.add();
		up.yee();
		
		System.out.println(up.y);
		
	}

}

class UCP
{
	protected int x;
	protected int y;
	UCP()
	{
		x=10; y=10;
	}
	int add()
	{
		System.out.println("P add");
		return x+y;
	}
	void yee()
	{
		System.out.println("yee");
	}
}

class UCC extends UCP
{
	private int z;
	UCC()
	{
		x=100; y=200; z=300;
	}
	public int add()
	{
		System.out.println("C add");
		return x+y;
	}
	public int sub()
	{
		return x-y-z;
	}
	public int getZ()
	{
		return z;
	}
}