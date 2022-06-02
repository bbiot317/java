package d0429;

public class Wraptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wrap t = new Wrap();
		t.add(Integer.valueOf(10));
		t.add(Integer.valueOf(25));
		t.add(35);
		t.add(Float.valueOf(3.56f));
		t.add(3.14f); // auto boxing
		System.out.println(Integer.valueOf(444));
		Integer i = Integer.valueOf(10);
		Integer i2 = new Integer(21);
		System.out.println(i2.compareTo(i));
		
		Character obj_ch = Character.valueOf('c');
		System.out.println(obj_ch); // auto unboxing
		System.out.println(Character.isDigit(obj_ch));
		String a = "432";
		int c = (int) (Object) a;
		System.out.println(c);
		
	}

}
class Wrap
{
	Object[] arr = new Object[10];
	int cnt;
	
	void add(Object ob)
	{
		arr[cnt++] = ob;
	}
	public void prt()
	{
		int i;
		for ( i = 0; i < cnt; i++)
		{
			Object o = arr[i];
			System.out.println(o+"/");
			if (o instanceof Integer)
			{
				System.out.println("integer");
				System.out.println(((Integer) o).intValue());
			}
			else if( o instanceof Float)
			{
				System.out.println("flo");
				System.out.println(((Float) o).floatValue());
			}
		}
	}
}