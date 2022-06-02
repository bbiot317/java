package d0415;

public class Mypointm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mypoint t = new mypoint(1,1);
		t.setx(151);
		
		System.out.println(t.x);
		
	}

}

class mypoint
{
	int x;
	int y;
	void setx(int x){ 
		this.x = chk(x);
	}
	void sety(int x){ 
		y= chk(x); 
	}
	int getx() {return x;}
	int gety() {return y;}
	
	mypoint(){ x=y=0; }
	
	mypoint(int x, int d)
	{
		y =chk(d);
		this.x = chk(x);
	}
	int chk(int a)
	{
		if(a<0 || a>100) {
			System.out.println("error");
			return x;
		}
		return a;
	}
	
	
}