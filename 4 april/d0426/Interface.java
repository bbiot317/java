package d0426;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C m = new C();
		m.mul();
		myinter1 m2 = new C();
		myinter2 m3 = new C();
		m2.add();
		
		m3.mul();
		((C)m3).add();
		
	}

}

interface A
{
	int x = 10;
	int y = 20;
	void test();
	void test2();
}

class B implements A
{
	public void test()
	{
		
	}
	public void test2()
	{
		
	}
}

interface myinter1
{
	int size= 10;
	int add();
}
interface myinter2
{
	int max=5;
	void mul();
}

class C implements myinter1, myinter2
{
	public int add()
	{
		int sum=0;
		return sum;
	}
	
	public void mul()
	{
		int result = 1;
		
	}
	
}