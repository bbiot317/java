package test;
import java.io.IOException;
import java.io.InputStream;
 
public class Input_Test {
 
	public static void main(String[] args) throws IOException {
		
		InputStream inputstream = System.in;
		int a;
		while( ( a = inputstream.read()) != -1)
		System.out.println(a);
	
	}
}