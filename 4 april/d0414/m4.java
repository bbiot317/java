package d0414;

public class m4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thistest t = new thistest();
		m4 m1 = new m4("aa","11","seo");
		t.setm4(m1.getm4());
		System.out.println(t.arr[0]);
		
	}

	String name;
	String tel;
	String add;
	
	m4(String a, String c, String d)
	{
		name = a;
		tel = c;
		add =d;
	}
	m4 getm4()
	{
		return this;
	}
	
	
}

class thistest
{
	m4[] arr = new m4[10];
	int cn = 0;
	
	void setm4(m4 m)
	{
		arr[cn++]=m;
	}
}
