package exam16;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadArrayOffsetTest {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test2.db");

		byte[] buffer = new byte[5];
		int readByteNum = is.read(buffer, 1, 3);
		System.out.println("-----" + readByteNum);
		
		for (int i = 0; i < buffer.length; i++) {
			System.out.println(buffer[i]);
		}

		is.close();

	}

}
