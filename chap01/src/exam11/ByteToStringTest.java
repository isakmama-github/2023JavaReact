package exam11;

import java.io.IOException;

public class ByteToStringTest {

	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		byte[] bytes2 = new byte[100];
		
		System.out.print("입력: ");
		
		int readCount = 0;
		try {
			readCount = System.in.read(bytes2);
			String str3 = new String(bytes2, 0, readCount-2, "UTF-8");
			System.out.println(str3);
			
			byte[] bytes3 = str3.getBytes("UTF-8");
			System.out.println(bytes3.length);
			
			str3 = new String(bytes2, 0, readCount-2, "UTF-8");
			
			//str3 ="안녕하세요"; 
			System.out.println(str3);
			bytes3 = str3.getBytes("EUC-KR");
			System.out.println(bytes3.length);
			str3 = new String(bytes3,"EUC-KR");
			System.out.println(str3);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
  
//		\r \n
	}

}
