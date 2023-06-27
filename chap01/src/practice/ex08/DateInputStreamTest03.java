package practice.ex08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*03. 5개의 double 타입 숫자로 구성된 배열을 사용해 다음 작업을 수행하는 
 * 프로그램을 작성하시오.
	- 배열의 모든 원소를 C:/Temp/double.txt파일에 DataOutputStream을 
	사용해 저장한다.
	- 저장된 숫자를 DataInputStream을 사용해 읽은 후 화면에 출력한다.
 */

public class DateInputStreamTest03 {

	public static void main(String[] args) throws Exception {
		Double[] doubleNum = { 1.0, 5.4, 2.6, 2.8, 5.9 };

		FileOutputStream fos = new FileOutputStream("C:/Temp/double.txt");
		DataOutputStream dos = new DataOutputStream(fos);

		for (int i = 0; i < doubleNum.length; i++) {
			dos.writeDouble(doubleNum[i]);
		}
		FileInputStream fis = new FileInputStream("C:/Temp/double.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0;i<doubleNum.length; i++) {
		System.out.print("("+dis.readDouble()+")");
		}
		
		dis.close();
	}

}
