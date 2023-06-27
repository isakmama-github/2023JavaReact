package exam16;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class StringWriteTest {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		Reader reader = new FileReader("C:/Temp/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char[] array = {'A', 'B', 'C'}; 
		String str = "안녕 자바";
		
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		writer.write(array);
		writer.write(array, 1, 2);
		writer.write(str);
		
		writer.close();
		
		while(true) {
			int data = reader.read();
			if(data == -1) break;
			System.out.println((char)data);
		}
		reader.close();
		
		reader = new FileReader("C:/Temp/test7.txt");
		char[] buffer = new char[100];
		while(true) {
//			int readCharNum = reader.read(buffer,2,3);
			int rcnt = 4;
			int readCharNum = reader.read(buffer,rcnt, 7);
			System.out.println("readCharNum : " + readCharNum);
			if (readCharNum == -1) break;
			for(int i=0; i<100; i++) {
				System.out.print(buffer[i]);
			}
			System.out.println();
		}
		reader.close();
	}

}
