package exam16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintTest {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = 
				new FileOutputStream("C:/Temp/printStream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린트 보조 스트림]");
		ps.print("마치 ");
		ps.print("프린터가 출력하는 것처럼 ");
		ps.print("데이터를 출력합니다. ");
		ps.print("오호~ ");
		ps.close();

	}

}
