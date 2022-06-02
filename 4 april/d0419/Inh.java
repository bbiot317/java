package d0419;

public class Inh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
	}

}

class Child extends Person
{
	Child()
	{
		System.out.println("cild");
	}
	int hobby;
}
