package practice.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
			/*[문제01] 키보드로 입력한 정수가 19이상이면 '성년' , 아니면 
			'미성년'을 출력하는 프로그램을 if~else문을 사용해 작성하라.*/
		
		System.out.println("나이를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age>=19) {
				System.out.println("성년");
		}else {
			System.out.println("미성년");
		}
		
	}

}
