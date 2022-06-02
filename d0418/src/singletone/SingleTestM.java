package singletone;

public class SingleTestM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTest t = SingleTest.getSingleTest();
		t.setX(7);
		System.out.println();
		
	}

}

class SingleTest
{
	private static SingleTest s = new SingleTest();
	private int x;
	private int y;
	
	private SingleTest()
	{
		x=20;
		y=20;
	}
	public static SingleTest getSingleTest()
	{
		return s;
	}
	
	void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return y;
	}
}
