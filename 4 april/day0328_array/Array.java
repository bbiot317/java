package day0328_array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] a;
//		a = new int[2][];
//		a[0] = new int[3];
//		a[1] = new int[3];
//		
//		
//		a[0][0]=100;
//		a[0][1]=50;
//		a[0][2]=20;
//		
//		int[][] a = new int[2][3];
//		
		int[][] stu = {
					{100,50,20},//열
					{10,40,80}  //열
		};
	
//	키, 발, 수
//   a 10개
//	int[] b = new int[10];
//	b[9]=10;
	int[][] a ; 
	a=new int[10][3];
	a[0][0] = 100; // 못담음 
	a[0][1] = 50;
	a[0][2] = 20;
	a[1][0] = 10;
	for(int i=0;i<10;i++) {
		for(int j=0;j<3;j++) {
			a[i][j]=i;	
		}
		
	}
	char[][] fr = new char[][] {{'a','p','p','l','e'},{'l','e','m','o','n'}};
	int i = 0; //[][] <- 참조타입
	int j = 0;
	while(i<2) {
		while(j<5) {
			System.out.print(fr[i][j]);
			j++;
		}
		i++;
		j=0;  
		System.out.println();
	}
	
	int[][] gugu = new int[9][9];
	for(i=2;i<10;i++) {
		for(j=1;j<10;j++) {
			gugu[i-2][j-1]=i*j;
			System.out.print(gugu[i-2][j-1]+"\t");
		}
		System.out.println();
	}
	int[][]score=new int[5][3];
//	
//	int[][] hw = new int[5][5]; 
//	for(int a1=0;a1<5;a1++)	{
//		for(int a2=0;a2<5;a2++) {
//			hw[a1][a2]=a2+1+5*a1;
//			System.out.print(String.format("%-3s", hw[a1][a2]));
//		}
//		System.out.println();
//	}

	int[][] hw = new int[5][5]; 
	int c =0;
	for(int a1=0;a1<5;a1++)	{
		for(int a2=0;a2<5;a2++) {
			hw[a1][a2]= c++;
			System.out.print(String.format("%-3s", hw[a1][a2]));
		}
		System.out.println();
	}
	
	
	int[][] v3 = new int[5][5];
	c=1;
	for (i=0; i<v3.length ;i++) {
		for (j=0; j<v3.length ; j++) {		
			System.out.print(String.format("%-3s", v3[i][j]=c));
		}
		c++;
		System.out.println();
	}
	
	
	int[][] h3 = new int[5][5];
	for (i=0; i<h3.length ;i++) {
		for (j=0; j<h3.length ; j++) {		
			System.out.print(String.format("%-3s", h3[i][j]=j+1));
		}
		System.out.println();
	}

System.out.println("---------------------");
//	행부터 12345
	c=1;
	int[][] h4 = new int[5][5];
	for (i=0; i<h4.length ;i++) {
		for (j=0; j<h4.length ; j++) {	//j=2, 2<5	
			h4[j][i]=c++;
			System.out.print(h4[j][i]+"\t"); //h4[0][0]=1, c=2 //
		}
		
		System.out.println();
	}

System.out.println("---------------------");
	
	c=1;
	int[][] h5 = new int[5][5];
	for (i=0; i<h5.length ;i++) {
		for (j=0; j<i+1 ; j++) {
			h5[i][j]=c++;
			System.out.print(h5[i][j]+"\t");
		}
		System.out.println();		
	}	
		
		
	int[][]h6 = new int[5][5];
	c=1;
	for (i=0; i<h6.length; i++) {
		for(j=0; j<i; j++) {
			System.out.print(String.format("%3s",h6[i][j]=0));
		}
		for (j=0+i; j<h6.length; j++) {
			System.out.print(String.format("%3s",h6[i][j]=c++));
		}
		System.out.println();
	}	


}
}