package movie;

import java.util.Scanner;

class MainMenu extends Abs{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	

	static void run()
	{
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("1. 예매\n2. 예매확인\n3. 예매취소\n4. 종료\n5. 관리자");
			System.out.print("----------입력:");
			switch(sc.nextInt()){
				case 1: User.book();
					break;
				case 2: User.check();
					break;
				case 3: User.cancel();
					break;
				case 4: run=false;
					System.out.println("종료");
					break;
				case 5: Admin.run();
					break;
			}
		}
	}
	
	

}



abstract class Abs
{
	static boolean run=true;
	static void run() {};
}

