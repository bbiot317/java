package d0420;

public class Mymath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(sum(4,5));
		Mymath t = new Mymath();
		System.out.println(t.sum(31,4));
	}

	
	static int sum(int x,int t)
	{
		return x+t;
	}
	
	int sum2(int y,int x)
	{
		return x+y;
	}
}
