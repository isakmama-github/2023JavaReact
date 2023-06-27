package practice.ex06;

import java.util.ArrayList;
import java.util.List;

public class StringLength {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		
//		02. ArrayList를 이용해 '갈매기', '나비', '다람쥐', '라마'를 원소로 입력한 후 
		al.add("갈매기");
		al.add("나비");
		al.add("다람쥐");
		al.add("라마");
//		각 원소에서 문자열 크기가 2인 단어만 출력하는 프로그램을 작성하시오.
		for (String str : al) {
			if (str.length()==2)
				System.out.println(str);
		}
		
		
	}
}
