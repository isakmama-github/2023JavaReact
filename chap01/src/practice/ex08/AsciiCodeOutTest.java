package practice.ex08;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AsciiCodeOutTest {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		for(int i=48; i<58; i++) {
			os.write(i);
			
		}
		for(int i=65; i<91; i++) {
			os.write(i);
		}
//		System.out.println();
		os.flush();
	}
}
