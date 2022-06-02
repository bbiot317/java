package d0413;

public class StaticMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod sm = new StaticMethod();
		StaticMethod.a = 10;
		sm.b = 20;
		StaticMethod.test(30);
		for( String s : args) {
			System.out.println(s);
		}
		
		while(int i=0 <10) {
			
		}
		
	}

}

class StaticMethod
{
	static int a;
	static int b;
	
	static void test(int x)
	{
		int sum= 0;
		sum = a + b + x;
		sum = a + x;
		System.out.println(sum);
		test2();
		test3();
	}
	static void test2()
	{
		System.out.println("test2");
	}
	static void test3()
	{
		System.out.println("test3");
	}
	
	
}


