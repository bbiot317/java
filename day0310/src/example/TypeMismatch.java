package example;

public class TypeMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b=13;
		float c = 0;
		c = (a+b)/2f; // (a+b)/2.0f
		System.out.println(c);
		
		char c1='A';
		char c2= ++c1;
		char c3= (char)((int)c1+1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
