package movie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class MainMenu extends Abs{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	

	static void run()
	{
		
		while(run) {
			System.out.println("1. 예매\n2. 예매확인\n3. 예매취소\n4. 종료\n5. 관리자");
			System.out.print("----------입력:");
			switch(sc.nextInt()){
				case 1: book();
					break;
				case 2: check();
					break;
				case 3: cancel();
					break;
				case 4: run=false;
					System.out.println("종료");
					break;
				case 5: Admin.run();
					break;
			}
		}
	}
	

		static void book() {
			Admin.view();
			System.out.print("예매할 영화:");
			String s=sc.next();
			for(String i:ar) {
				String[] t = i.split(",");
				if(t[0].equals(s)) {
					try {
						BufferedWriter bw = new BufferedWriter(new FileWriter("reservation.txt"));
						bw.write(i);
						bw.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		static void check() {
			
		}
		
		static void cancel() {
			
		}
	}





abstract class Abs
{
	static Scanner sc= new Scanner(System.in);
	static ArrayList<String> ar=new ArrayList<>();
	static boolean run=true;
	static void run() {};
}

