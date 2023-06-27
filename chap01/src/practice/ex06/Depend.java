package practice.ex06;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Depend {

//	Hashtable을 이용해 4개의 이름과 점수를 저장하시오. 
//	그리고 키보드로 이름을 입력하면 대응하는 점수를 
//	알려 주는 프로그램을 작성하시오.
//	Map<String, Integer> map = new Hashtable<>();
//	map.put("김열공",80); map.put("최고봉",90);
//	map.put("우등생",95); map.put("나자바",88);
	
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();

		map.put("김열공",80); map.put("최고봉",90);
		map.put("우등생",95); map.put("나자바",88);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 ^_^ :");
		String id = scanner.nextLine();
		
		if(map.containsKey(id)) {
			int score = map.get(id);
			System.out.println(id+ " 학생의 점수는 " + score + "점 입니다.");
		}else {
			System.out.println("그런 학생은 존재하지 않습니다 ㅠ.ㅠ");
		}
		
		
//		switch(id) {
//		case "김열공":
//		case "우등생":
//		case "최고봉":
//		case "나자바":
//			System.out.println(map.get(id));
//			break;
//		default:
//			System.out.println("그런 학생이 없네요 ㅠ.ㅠ");
//			break;
				
			
		}
		

		}




