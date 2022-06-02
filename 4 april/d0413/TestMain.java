package d0413;

public class TestMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test sd = new Test();
		int[] ss = new int[] {1,2};
		System.out.println(sd.sum(ss));
	}

}
class Test
{
	int total;
	int sum(int[] a)
	{
		for( int i : a) {
			total += i;
		}
		return total;
	}
}
