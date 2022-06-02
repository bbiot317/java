package d0414;

public class M5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mem5 m = new Mem5();
		System.out.println(m.tel);
	}

}

class Mem5
{
	String name;
	String tel;
	String add;
	
	Mem5(){

		this("no n");
		System.out.println("nopa");
	}
	Mem5(String name){
		this("n","kl","jkl");
		System.out.println("1para");
	}
	Mem5(String string, String string2, String string3) {
		System.out.println("3para");
		name=string;
		tel=string2;
		add=string3;
	}

}