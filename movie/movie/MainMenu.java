package movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class MainMenu extends Abs{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("프로그램 시작");
		
		run();
		
	}
	

	static void run()
	{
		
		while(run) {
			try {
			System.out.println("1. 예매\n2. 예매확인\n3. 예매취소\n4. 종료\n5. 관리자");
			System.out.print("----------입력:");
			switch(sc.nextInt() )
			 { 
				case 1: book();
					break;
				case 2: check();
					break;
				case 3: cancel();
					break;
				case 4: run=false;
					System.out.println("종료");
					break;
				case 5: System.out.println("비밀번호: "); 
					if(sc.next().equals("11")) 
						AdminMenu.run();
					else System.out.println("틀렸습니다.");
					break;
			}
			}catch(Exception e) {
				e.printStackTrace();
				sc=new Scanner(System.in);
			}
		}
	}
	

		static void book() {

			AdminMenu.view();
			
			System.out.print("예매할 영화:");
			String movienum=sc.next();
			
			try {
				
				for( String line : Movie.lines) {
					if(line.split(",")[0].contains(movienum)) {
						Seats seats = new Seats();
						Reservation reservation = new Reservation();
						
						String a;
						while( (a = reservation.br.readLine()) != null ) { //예매 좌석들 읽기
							if(a.contains(movienum)) {
								String[] b = a.split(",")[a.split(",").length-1].split("-");
								
								switch(b[0]){
									case "A": b[0]="0"; break;
									case "B": b[0]="1"; break;
									case "C": b[0]="2"; break;
									case "D": b[0]="3"; break;
									case "E": b[0]="4"; break;
								}
								int[] b2=new int[] {Integer.valueOf(b[0]), Integer.valueOf(b[1])};
								seats.seat[ b2[0] ][ b2[1]-1 ]='■';
							}
						}
						seats.screen();
						
						reservation.br.close();
							

						boolean b=true; //좌석이 맞는지 확인
						while(b) {
							System.out.print("좌석 선택(예:E-9) : ");
							String select = sc.next();
							String[] selected = select.split("-");
							
							switch(selected[0]){
								case "A": selected[0]="0"; break;
								case "B": selected[0]="1"; break;
								case "C": selected[0]="2"; break;
								case "D": selected[0]="3"; break;
								case "E": selected[0]="4"; break;
							}
							for(int row=0; row<seats.seat.length; row++) {
								for(int col=0; col<seats.seat[0].length; col++) {
									//좌석이 맞는지 확인
									if(row==Integer.parseInt(selected[0]) && col==Integer.parseInt(selected[1])-1 )  
									{
										if(seats.seat[row][col]=='■') {
											System.out.println("이미 예약된 좌석");
											break;
										}
										b=false;
										long ticket=System.currentTimeMillis();
										reservation.bw.write(ticket+","+line.split(",")[0]+","+line.split(",")[1]+","+select+"\n");
										System.out.println("발급번호: "+ticket);
										System.out.println("--------------------------");
										break;
									}
								}
							}
							if(b)
								System.out.println("좌석을 잘못 입력했습니다.");
						}
//						bw.flush();
						reservation.bw.close();
						return;
					}
				}
				
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		static void check() {
			System.out.print("발급번호:");
			String ticket=sc.next();
			
			try {
				Reservation reservation = new Reservation();
				
				String a;
				while( (a= reservation.br.readLine()) != null )
						if(a.contains(ticket)) {
							System.out.println("[확인 완료]영화: "+a.split(",")[2]+", 좌석: "+a.split(",")[3]);
							return;
						}
				System.out.println("없는 번호");
				reservation.br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
		
		static void cancel() {
			System.out.print("취소할 번호:");

			String ticket=sc.next();
			try {
				Reservation reservation = new Reservation();
				
				String temp;
				ArrayList<String> ar=new ArrayList<>();
				while( (temp=reservation.br.readLine())!=null) {
					if(temp.split(",")[0].equals(ticket)) {
						System.out.println(temp.split(",")[0]+"취소됨");
						continue;
					}
					ar.add(temp);
				}
					BufferedWriter bw = new BufferedWriter(new FileWriter(reservation.file));
					for(String i : ar)
						bw.write(i+"\n");
//					bw.flush();
					bw.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		
		
	
}

class Seats
{
	char[] row = new char[] {'A','B','C','D','E'};
	char[][] seat = new char[5][9];
	Seats() {
		for(int j=0; j<seat.length; j++ ) {
			for(int k=0; k<seat[0].length; k++) {
				seat[j][k]='O';
			}
		}
	}
	
	void screen(){
		System.out.println("--------------------------");
		System.out.println("----------SCREEN----------"); 
		System.out.println("--------------------------");
		for(int j=0; j<seat.length; j++ ) {
			System.out.print("  "+row[j]+" ");
			for(int k=0; k<seat[0].length; k++) {
				System.out.print(seat[j][k]+" ");
			}
			System.out.println();
		}
		System.out.print("  "+"  ");
		for(int j=0; j<seat[0].length; j++)
			System.out.print(j+1+" ");
		System.out.println();
		System.out.println("--------------------------");
	}
	
}

class Reservation
{
	File file = new File("reservations.txt");
	BufferedReader br ;
	BufferedWriter bw ;
	
	Reservation() throws IOException{
		if(!file.exists())
			file.createNewFile();
		 br=new BufferedReader(new FileReader(file));
		 bw= new BufferedWriter(new FileWriter(file,true));
	}
}




abstract class Abs
{
	static Scanner sc= new Scanner(System.in);
	static boolean run=true;
	static void run() {};
}

