package student;

public class StudentM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student();

		System.out.println(a.getName());
		a.setName("이룸"); 
		a.setNum(3);
		System.out.println(a.getName());
	}

}

class Student
{
	private String name="df";
	private int num=44;
	
	Student()
	{
		
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	///
	void setNum(int num)
	{
		this.num = num;
	}
	int getNum()
	{
		return num;
	}
}