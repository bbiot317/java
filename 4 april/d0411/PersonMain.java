package d0411;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person hong = new Person();
		hong.input("홍", 20, "서");
		Person.countP++;
		
		Person lee = new Person();
		lee.input("이",30,"제");
		Person.countP++;
		
		hong.printInstance();
		System.out.println(lee.add);
		Person.print();
		hong.print();

	}

}

class Person
{
	static int countP;
	String name;
	int age;
	String add;
	
	void input(String _name, int _age, String _add)
	{
		name= _name;
		age = _age;
		add = _add;
	}
	static void print()
	{
		System.out.println(countP);
		System.out.println(name);
		System.out.println(age);
		System.out.println(add);
		printInstance();
		
	}
	
	void printInstance()
	{
		System.out.println(name);
	}
	
	
}