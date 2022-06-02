package d0419;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student t = new Student();
	}

}

class Person
{
	int num;
	String name;
	String dept;
	String add;
	
	Person()
	{
		System.out.println("per성자");
	}
	Person(int n,String n2, String n3)
	{
		num = n;
		name = n2;
		dept = n3;
		
	}
}

class Student extends Person
{
	String[] subjects;
	
	Student()
	{
		super();
		System.out.println("stu성자"+num);
	}
	Student(int n,String a,String b)
	{
		super(n, b, a);
		
	}
	
}

class Profess
{
	String[] subjects;
	
}

class staff
{
	String job;
	staff()
	{
		System.out.println("staff성자");
	}
}






