//07. 파일 이름을 나타내는 문자열과 특정문자를 주면 파일 속에 포함된 
//특정 문자의 개수를 찾을 수 있는 CountLetter 클래스를 두가지 방식(입출력 스트림 및 채널)으로 작성하시오.
//
//== 출력결과 : 파일을 입력하세요 : C:/Temp/words.txt
//              세고자하는 문자를 입력하세요 : e
//              C:/Temp/words.txt 파일에 e문자가 5개 있습니다.

/*
 *  0. CountLetter 클래스를 구현화한다.
 *  	* toCharArray, getOrDefault 를 이용한다.
 *  	1) 파일을 열어 문자열을 읽는다.
 *  	2) 읽은 문자열을 hashMap에 저장한다. 문자열을 key값으로, 문자의 갯수는 value 값으로 저장한다.
 *  1. 키보드에서 문자열을 받아 파일을 읽는다.
 *  2. 키보드에서 문자열을 입력받아 CounterLetter 클래스의 인스턴스를 만들고, hashMap에 문자와 문자의 개수를 저장한다.
 *  3. HashMap의 요소를 출력한다.
 *    
 */


package practice.ex08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws Exception {
		
		Map<Character, Integer> letterCount = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("경로 : C:/Temp/ ");
		System.out.print(".txt파일 이름을 입력해주세요 > ");
		String fileName = sc.nextLine();
		String filePath = "C:/Temp/" + fileName + ".txt";
		
		//filePath에 지정된 파일을 읽기 위한 i/0 스트림
		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		// 세고자 하는 문자 입력 받음
		System.out.print("세고자하는 문자를 입력하세요 : ");
		char targetChar = sc.nextLine().charAt(0);
		
		// 파일에서 읽어온 문자열을 line에 저장하고 letterCount에 저장하면서 Count.
		String line = bufferedReader.readLine();
		while (line != null) {
		    for (char cha : line.toCharArray()) {
		            letterCount.put(cha, letterCount.getOrDefault(cha, 0) + 1);
		    }
		    line = bufferedReader.readLine();
		}
		
	    // 저장된 letterCount HashMap에서문자의 개수 출력
		Integer count = letterCount.get(targetChar);
		if (count != null) {
		    System.out.println(targetChar + "의 개수 : " + count);
		} else {
		    System.out.println(targetChar + "은(는) 파일에 존재하지 않습니다.");
		}
		
		System.out.println("===============================================================");
		
   
	    // 저장된 letterCount HashMap의 모든 내용을 출력
		int i = 1;
		System.out.println("letterCounter에 저장된 자료들");
		System.out.println("===============================================================");
	    for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
	    	if(i % 5 == 0) {
	    		System.out.print("| [" + entry.getKey() + "]" + " : " + entry.getValue() + "개 |");
	    		System.out.println();
	    	}
	    	else {
	    		System.out.print("| [" + entry.getKey() + "]" + " : " + entry.getValue() + "개 |");
	    	}
	    	i++;
	    }
	    System.out.println("===============================================================");

	    // 파일과 스트림을 닫음
	    bufferedReader.close();
	    fileReader.close();
	    sc.close();
	}
}
