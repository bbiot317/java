package d0404;

public class Recurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(com(3));
		
		
		
		
	}

	
	static int com(int x)
	{
		int ret=0;
		if (x==1){
			ret=1;
		}
		else {
			ret=x*(com(x-1));
		}
		return ret;
	}
	
	
	
}
//       ret= 4*(com(3)); 
//			= 4*3*(com(2))
//			= 4*3*2*1