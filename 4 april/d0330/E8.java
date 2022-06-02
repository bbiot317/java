package d0330;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[][] score = new Object[4][4];
		score[0][0]="국";
		score[0][1]="영";
		score[0][2]="수";
		score[0][3]="총";
		Scanner sc = new Scanner(System.in);
		
	
				
		int t = 0;
		int s = 0;
		int i,j;
		i=j=0;
		for(i=1; i< score.length; i++) {
			score[i][3] = 0;
			System.out.println(i+"번째 사람의 ");
			for(j=0; j< score.length-1; j++) {
				System.out.print(score[0][j]+" :");
				
				s = (int) (score[i][j] = sc.nextInt());
				score[i][3] = (int)score[i][3] + s;
			}
			System.out.println();
		}
		for(i=0; i< score.length; i++) {
			for(j=0; j< score.length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
