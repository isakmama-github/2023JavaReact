package practice.ex07;

import java.util.Arrays;
import java.util.stream.Stream;

//1.4개의 문자열 ('갈매기', '나비', '다람쥐', '라마')을 포함하는 리스트 객체를 스트림으로 생성한 후
//문자열 크기가 2인 단어만 출력하는 프로그램을 작성하라.


public class Animal01 {
	public static void main(String[] args) {
		String[] strArr = {"갈매기","나비","다람쥐","라마"};
		Stream<String> strStream = Arrays.stream(strArr);
		
		System.out.println(":: 문자열 크기가 2인 단어 출력 ::");
		strStream.filter(n->n.length()==2).forEach(System.out::println);
		
	}


}
