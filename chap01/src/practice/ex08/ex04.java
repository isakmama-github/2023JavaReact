package practice.ex08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

//04. 키보드로 입력한 이름의 자바 소스 파일을 찾아 맨 앞에 행 번호를 붙여서 출력하는 프로그램을 작성하시오.
public class ex04 {

	public static void main(String[] args) throws Exception {
		int cnt = 1;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(), value="";
		String path = "C:/Temp/" + str;
		System.out.println(path);
		
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("파일이 없습니다.");
			sc.close();
			return;
		}
		
		sc.close();
		
		InputStream is = new FileInputStream(path);
		Reader  reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			value = br.readLine();
			if(value == null) break;
			
			System.out.println(cnt + ". " + value); cnt++;
		}
		br.close();
	}
}
