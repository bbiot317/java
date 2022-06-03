package movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Admin extends Abs {

	static void run() {
		System.out.println("<관리자 모드>");
		
		while(run) {
			System.out.println("1. 등록\n2. 목록\n3. 삭제\n4. 종료\n5. 메인으로");
			System.out.print("----------입력:");
			switch(sc.nextInt()){
				case 1: Admin.add();
					break;
				case 2: Admin.view();
					break;
				case 3: Admin.del();
					break;
				case 4: 
					System.out.println("종료");
					MainMenu.run=false;
					break;
				case 5: MainMenu.run();
					break;
			}
		}
	}
	
	static void add() {
		File mov = new File("movie/movies.txt");
		if(!mov.exists())
			try {
				mov.createNewFile();				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(mov,true));
			System.out.print("제목:");
			bw.write(System.currentTimeMillis()+","+sc.next());
			System.out.print("장르:");
			bw.write(","+sc.next()+"\n");
			bw.close();
			System.out.println(">>완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void view() {
		try {
			BufferedReader br=new BufferedReader(new FileReader("movie/movies.txt"));
			String ss;
			
			while( (ss=br.readLine()) != null) {
				String[] s = ss.split(",");
				ar.add(ss);
				System.out.println("["+s[0]+"]: "+s[1]+"("+s[2]+")");
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void del() {
		view();
		System.out.print("삭제할 영화:");
		String s=sc.next();
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter("movie/movies.txt"));
			for(String i:ar) {
				String[] t = i.split(",");
				if(t[0].equals(s)) 
					continue;
				bw.write(i+"\n");
				bw.flush();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
	
	
}
