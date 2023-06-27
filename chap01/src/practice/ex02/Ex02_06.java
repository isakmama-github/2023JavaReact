//철수와 영희가 가위(s), 바위(r), 보(p) 게임을 한다. 다음 실행 결과와 같이 s, r, p 중 하나를 입력해 승자 또는 무승부를 출력하는 프로그램을 작성하라.
//
//
package practice.ex02;

import java.util.Scanner;

public class Ex02_06 {

	public static void main(String[] args) {
		System.out.println("가위는 s, 바위는 r, 보는 p로 입력합니다.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("철수의 선택");
		String su = scanner.nextLine();
		System.out.println("영희의 선택");
		String young = scanner.nextLine();;
		
		if (su.equals(young)) {
			System.out.println("무승부");
		}
		else if (
			(su.equals("s") && young.equals("p")) ||
			(su.equals("r") && young.equals("s")) ||
			(su.equals("p") && young.equals("r"))) {
			System.out.println("철수의 승리입니다.");
		}
		else
			System.out.println("영희의 승리입니다.");
	scanner.close();
	}

//	public static class Rsp{
//		String name1, name2;
//		Char s, r, p;
//	}
}
