package practice.ex01;
import java.util.Scanner;

public class Exam005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 사용자가 입력할수있게만듬
		System.out.print("화씨온도(F): "); //문제 출제
		int f = scanner.nextInt(); // F에다가 숫자를 넣을수있음
		
		float c = (float) 5/9*(f-32); // 5/9*(f-32)가 섭씨구하는 공식 
		System.out.printf("섭씨온도(C): %.2f ",c);	//소수점 2자리까지 출력 
		
	}

}
