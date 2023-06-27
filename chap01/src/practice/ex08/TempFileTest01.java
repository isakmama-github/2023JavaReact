package practice.ex08;

import java.io.File;

/*
 *  01. C:/Temp/file.txt 파일의 유무를 출력하는 프로그램을 작성하시오.
 */
public class TempFileTest01 {
	public static void main(String[] args) {
		// C:/Temp/file.txt 이라는 파일을 파일 타입 dir에 넣는다.
		File dir = new File("C:/Temp/file.txt");
		// File.exists()는 파일 또는 폴더가 존재하는지 리턴합니다.
		// dir.exists() == false : dir의 파일이 있을 경우
		// dir.exists() == true : dir의 파일이 없을 경우
		if (dir.exists() == false) {
			System.out.println("파일이 존재하지 않습니다.");
		} else {
			System.out.println("파일이 존재합니다.");
		}
		
		
		if ((new File("C:/Temp/file.txt")).exists() == true) {
			System.out.println("파일이 존재합니다.");
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
	}

}
