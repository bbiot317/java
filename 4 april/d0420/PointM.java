package d0420;

public class PointM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3d p3 = new Point3d();
		System.out.println(p3.x);
	}

}

class Point
{
	int x = 10;
	int y = 20;
	
	Point()
	{
		System.out.println("p");
		x=100;
		x=200;
	}
	Point(int x,int y)
	{
		System.out.println("2");
		this.x = x;
		this.y = y;
	}
}

class Point3d extends Point
{
	int z = 30;
	
	Point3d()
	{
		super(5,6);
		System.out.println("3d");
		x=1000;
		y=2000;
		z=300;
	}
}






