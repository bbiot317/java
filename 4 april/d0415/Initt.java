package d0415;

public class Initt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initest t = new Initest();
		t.print();
	}

}

class Initest
{
	int x=5;
	static int y = 5;
	String str = "as";
	Initest(){
		System.out.println("생성자");
		x=30;
		y=30;
		System.out.println(x);
	}

	
	{
		System.out.println("init block x"+x);
		System.out.println(y);
		x=20;
		y=20;
		System.out.println(x);
		System.out.println(y+"ed");
		str = "b";
		
	}
	static {
		System.out.println("stat "+y);
		y = 10;
	}

	void print() {
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("str:"+str);
	}
}
