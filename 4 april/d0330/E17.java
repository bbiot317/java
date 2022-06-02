package d0330;

public class E17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] bin = new char[5][5];
		int B = 0;
		int chek = 0;
		
		
		while(B<5) {
			int H = (int) (Math.random()*5);
			int V = (int) (Math.random()*5);
			if(bin[H][V]=='\0') {
				bin[H][V]='X';
				chek++;
				System.out.println(chek+"번째");
			}
			else if(bin[H][V]!='\0') {
				continue;
			}
			if(chek<5) {
				continue;
			}
			bin[H][V]='O';
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(String.format("%-2c", bin[i][j]));
				}
				System.out.println();
			}
			bin[H][V]='X';
			
			
			int[] jul = new int[4];
			int temp=0;
			
			jul[2]=0;
			jul[3]=0;
			for(int i=0; i<5; i++) {
				jul[0]= 0; 
				jul[1]= 0;
				for(int j=0; j<5; j++) {
					jul[0] = (bin[i][j]!='\0')? ++jul[0] : jul[0];
					jul[1] = (bin[j][i]!='\0')? ++jul[1] : jul[1];					
				}
				jul[2] = (bin[i][i]!='\0')? ++jul[2] : jul[2];
				jul[3] = (bin[4-i][i]!='\0')? ++jul[3] : jul[3];
				
				if(jul[0]==5 ) {
					for(int re=0; re<5; re++) {
						bin[i][re]='■';}
				}
				if(jul[1]==5) {
					for(int re=0; re<5; re++) {
						bin[re][i]='■';}
				}
				if(jul[2]==5) {
					for(int re=0; re<5; re++) {
						bin[re][re]='■';}
				}
				if(jul[3]==5) {
					for(int re=0; re<5; re++) {
						bin[4-re][re]='■';}
				}
								
				for(int k=0; k<jul.length; k++) {
					if(jul[k]==5) {
						++temp;
					}
				}
			}//for
			
			
			if(temp> B) {
				  B = temp;
				  System.out.println("  "+B+" 빙고");
				for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						System.out.print(String.format("%-2c", bin[i][j]));
					}
					System.out.println();
				}
				System.out.println();
			}

			
			}			
		}//
		
		
		
		
	 

	


	
}
