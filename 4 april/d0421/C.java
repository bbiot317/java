package d0421;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a a = new a();
		b b = new b();
		a.he();
		b.he();
		a.bye("fff");
		b.bye("eee");
	}

}
class a
{
	void he()
	{
		System.out.println("A helle");
	}
	void bye(String str)
	{
		System.out.println(str+"잘가");
	}
}
class b extends a
{
	void he()
	{
		System.out.println("B hello");
		
	}
	void bye(String s)
	{
		System.out.println(s+"잘가");
	}
}
