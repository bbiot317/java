package temp;

public class makemax {
	
	
	
	static int makemax(int[] a)
	{
		int temp=a[0];
		for(int c=1; c<a.length; c++) {
			temp = (temp < a[c] )? a[c]: temp;
		}
		return temp;
	}	
	static int makesum(int[] a)
	{
		int sum=0;
		for(int c=0; c<a.length; c++) {
			sum += a[c];
			
		}
		return sum;
	}
	static double makeavg(int[] a)
	{
		int sum=0;
		for(int c=0; c<a.length; c++) {
			sum += a[c];
		}
		
		double ss4 = (float) sum / a.length ; 
		return ss4;
	}
	
	
	static int[] reverse(int[] a)
	{
		int[]r = new int[a.length];
		for(int i=0; i<a.length; i++) {
			r[i] = a[a.length-i-1];
			System.out.print(r[i]+",");
		}
		return r;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5,9,13,4};
		int[] arr2 = {10,20,30,45,48,16,89,77,59,100};
		
		int max = 0;
		int sum = 0;
		System.out.println(makemax(arr1));
		System.out.println(makesum(arr1));
		System.out.println(makeavg(arr1));
		
		System.out.println(reverse(arr2));
		
		
	}

}
