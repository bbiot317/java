package d0414;

public class mm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		member m1 = new member("n","010","w");
		
		m1.print();
		System.out.println(m1.getm());
		
	}

}

class member
{
	String name;
	String tel;
	String add;
	member getm()
	{
		return this;
	}
	member()
	{
		
	}
	member(String _name)
	{
		String name = _name;
	}
	member(String name,String tel,String add)
	{
		name = name;
		tel = tel;
		 add = add;
	}
	void print() {
		System.out.println(name);
		System.out.println(tel);
		System.out.println(add);
	}
}
