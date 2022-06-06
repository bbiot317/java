package movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class AdminMenu extends Abs {

	static void run() {
		System.out.println("<관리자 모드>");
		
		while(run) {
			System.out.println("1. 등록\n2. 목록\n3. 삭제\n4. 종료\n5. 메인으로");
			System.out.print("----------입력:");
			switch(sc.nextInt()){
				case 1: AdminMenu.add();
					break;
				case 2: AdminMenu.view();
					break;
				case 3: AdminMenu.del();
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

		
		try {
			
			Movie movie=new Movie();
			
			System.out.print("제목:"); 
			sc.nextLine();
			movie.bw.write(System.currentTimeMillis()+","+sc.nextLine());
			System.out.print("장르:");
			movie.bw.write(","+sc.nextLine()+"\n");
			movie.bw.close();
			System.out.println(">>완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void view() {
		try {
			
			Movie movie = new Movie();
			Movie.lines.clear();
			String line;
			while( (line=movie.br.readLine()) != null) {
				String[] s = line.split(",");
				Movie.lines.add(line);
				System.out.println("["+s[0]+"]: "+s[1]+"("+s[2]+")");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void del() {
		view();
		System.out.print("삭제할 영화:");
		String s=sc.next();
		try {
			Movie movie=new Movie();
			
			movie.bw=new BufferedWriter(new FileWriter(Movie.moviefile));
			for( String line : Movie.lines) {
				String[] t = line.split(",");
				if(t[0].equals(s)) {
					System.out.println(line+"삭제됨");
					continue;
				}

				movie.bw.write(line+"\n");
//				movie.bw.flush();
			}
			movie.bw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
class Movie 
{
	static ArrayList<String> lines = new ArrayList<>();
	static File moviefile = new File("movies.txt");
	BufferedReader br;
	BufferedWriter bw;
	
	Movie() throws IOException
	{
		if(!moviefile.exists())
			moviefile.createNewFile();
		br= new BufferedReader(new FileReader(moviefile));
		bw= new BufferedWriter(new FileWriter(moviefile,true));
		
	}


}
