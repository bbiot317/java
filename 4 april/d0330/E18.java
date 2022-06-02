package d0330;

public class E18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {22,57,11,32,91,68,70};		
		
		
		
		for(int i=0; i<a.length/2; i++) {					
			int temp = a[i];			
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;						
		}
		
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
