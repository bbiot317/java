package d0330;

public class E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star = {
				{'*', '*',' ',' ','/',},
				{'*', '*',' ',' ','/',},
				{'*', '*','*','*','/',},
				{'*', '*','*','*','/',},
		};
		int i=0;
		for(i=0 ; i< star[0].length; i++) {
			int j=0;
			for(j=0 ; j<star.length; j++) {
				System.out.print(star[star.length-1-j][i]);
				
			}
			System.out.println();
		}
	}

}
