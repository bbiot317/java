package d0420;

import java.util.Scanner;

public class StuM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student t = new Student(3,4);
	System.out.println("평: "+t.av());
	}

}

class Person
{
	Person(int x, int y)
	{
	}
}

class Student
{
	Student(int a, int b)
	{
		super();
	}
	float[] h = new float[8];
	
	float av()
	{	
		float sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<h.length; i++) {
			System.out.print(i+1+"학 : ");
			h[i]=sc.nextFloat();
			sum += h[i];
		}
		return sum/h.length;
	}
}
