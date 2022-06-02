package example;
import java.io.*;
public class Op2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("test.txt");
		
		FileOutputStream fos = new FileOutputStream("copy.txt");
		
		int buf;
		while( (buf= fis.read()) != -1)
		{
			System.out.println((char)buf);
			fos.write(buf);
		}
		fis.close();
		fos.close();
				
	}

}
