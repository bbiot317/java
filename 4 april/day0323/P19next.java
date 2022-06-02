package day0323;

public class P19next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		int[]h=new int[101];
		for (int a=1;a<101;a++) {
			h[a]=a;
			c = c + h[a];
			
		}
		System.out.println(c);
		
		int aa=0;
		int[] a = new int[] {2,10,8,5,3,9};
		for (int b=0;b<a.length;b++) {
			System.out.println(a[b]);
			aa += a[b];
		}
		System.out.println(aa);
	}

}
