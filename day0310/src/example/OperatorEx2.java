package example;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=0;
		j = i++;
		System.out.println("j=i++; ½ÇÇà ÈÄ, i=" +i + ", j= " +j);
		System.out.println(i);
		i=5;
		j=0;
		j=++i;
		System.out.println(j);
	}

}
