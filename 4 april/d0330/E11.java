package d0330;

public class E11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] an = new int[] {2,6,4,3};
		int i =0;
		int j=0;
		while(j<4) {
		   for(i=0; i<an[j]; i++) {
			   System.out.print("*");
		   }
		   System.out.println();
		   j++;
		}
	}

}
