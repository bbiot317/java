package hi;

public class Member {
	private String name;
	private String tel;
	private String add;
	
	void prtM()
	{
		System.out.println(name);
		System.out.println(tel);
		System.out.println(add);
	}
	
	//setter
	void setName(String name)
	{
		this.name=name;
	}
	void setTel(String tel)
	{
		this.tel = tel;
	}
	void setAdd(String add)
	{
		this.add=add;
	}
	
	//getter
	String getName()
	{
		return name;
	}
	String getTel()
	{
		return tel;
	}
	String getAdd()
	{
		return add;
	}
	
}
