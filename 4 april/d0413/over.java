package d0413;

public class over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 a = new Test2();
		a.add(2,4);
		
		
		
	}

}

class Test2{
	int add(int x, int y)
	{
		return x+y;
	}
	
	int add(int x)
	{
		return x;
	}
	int add(float x, float y)
	{
		return (int) (x+y);
	}
	
	
}