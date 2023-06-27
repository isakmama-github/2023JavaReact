package practice.ex08;
/* 02. BufferdReader클래스의 readLine() 메서드를 사용해 
 * 키보드에서 행 단위로 읽은 후 화면에 출력하는 프로그램을 작성하시오.
 * 한 줄, 한 줄 읽어서 출력 
 * Hint) 키보드는 표준 입력 장치이므로 InputStream타입의 System.in 객체를 사용한다. 
 * InputStream을 Reader타입으로 변환하려면 InputStreamReader클래스를 사용하면 된다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferdReaderTest02 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력하세요. : ");
		String str = br.readLine();
		System.out.println("입력된 내용  :" + str);
	}

}
