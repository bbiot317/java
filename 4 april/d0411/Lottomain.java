package d0411;

public class Lottomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] count = new int[45];
		Lotto[] noto = new Lotto[10]; //10게임

		
		for(int i=0; i<noto.length; i++) {
			noto[i]=new Lotto();
			noto[i].gen();
			for(int j=0; j<6; j++) {
				count[noto[i].lotto[j]-1]++;	
			}
		}

		int max = count[0];
		int idx = 1;
		for(int i=1; i<45; i++) {
			if (count[i]>max ) {
				max = count[i];
				idx=i+1;
			}
		}
		
		System.out.println(idx+"슛자"+max+"번");
		
	}//main

}

class Lotto
{
	int[] lotto = new int[6];
	
	void gen() 
	{
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if (lotto[i]==lotto[j]) {
					lotto[i]=(int)(Math.random()*45+1);
					j=-1;
				}
			}
			
		}
	}
	
	
	
}