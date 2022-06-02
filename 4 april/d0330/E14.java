package d0330;

public class E14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}			
		};

		int[][] ns = new int[score.length+1][score[1].length+1];
	
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[1].length; j++) {
				ns[i][j] = score[i][j];
			}			
		}
		
		
		
		for(int j=0; j<ns[1].length; j++) {
			for(int i=0; i<ns.length-1; i++) {				
				ns[ns.length-1][j] += ns[i][j];				
			}
		}	
		
		
		
		for(int j=0; j<ns.length; j++) {
			for(int i=0; i<ns[1].length-1; i++) {
				ns[j][ns[1].length-1] += ns[j][i];
				System.out.print(ns[j][i]+"\t");
			}
			System.out.print(ns[j][ns[1].length-1]);
			System.out.println();
		}

	
		
		}
		
	
		
		
		
	

}
