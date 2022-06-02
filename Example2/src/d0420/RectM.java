package d0420;

public class RectM {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r = new Rect(1,1,6,6);
		System.out.println(r.area());
		
		
		
	}

}

class Rect
{
	Rect(float a, int b,int c,int d)
	{
		this.a[0]=a;
		this.a[1]=b;
		this.d[0]=c;
		this.d[1]=d;
	}
	float[] a=new float[2];
	float[] d=new float[2];
	float[] b= {a[0],d[1]};
	float[] c= {d[0],a[1]};
	
	float area()
	{
		float area = (a[0]-d[0])*(a[1]-d[1]);
		if (area<0) {
			area*=-1;
		}
		return area;
	}
}

class squ extends Rect
{
	squ()
	{
		
	}
	float h;
	float volume()
	{
		return super.area()*h;
	}
}