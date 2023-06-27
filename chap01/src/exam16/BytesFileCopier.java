package exam16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BytesFileCopier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("대상파일 : ");
		String src = sc.nextLine();
		
		System.out.println("사본이름 : ");
		String dst = sc.nextLine();
		
//		try(InputStream in = new FileInputStream(src); 
//			OutputStream out = new FileOutputStream(dst)){
//			
//			int data;
//			while(true) {
//				data = in.read();
//				if (data == -1) break;
//				out.write(data);
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try(InputStream in = new FileInputStream(src); 
				OutputStream out = new FileOutputStream(dst)){
			byte buf[] = new byte[1024];
			int len;
			//int data;
			while(true) {
				len = in.read(buf);
				if (len == -1) break;
				out.write(buf,0 ,len);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
