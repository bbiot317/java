package d0414;

public class PointMa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point();
		Point p2 = new Point(	5,6	);
	}

}

class Point
{
	int x;
	int y;
	Point()
	{
		x=1; y=1;
	}
	Point(int a, int b)
	{
		x = a;
		y = b;	
	}
}