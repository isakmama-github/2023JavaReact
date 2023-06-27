package practice.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* [문제 2번] 원기둥의 부피를 구하는 프로그램을 작성하시오. */
		
		/* 2-1원기둥의 밑면 반지름을 구한다 >입력 받아야 함 
		 * 2-2 원기둥의 높이를 구한다 > 입력 받아야 함
		 * 2-3 원기둥의 부피를 구한다 > ㅠ(원주율) * 높이 * 반지름 * 반지름 */
		
		
		// 스캐너를 부른다
		Scanner scanner = new Scanner(System.in);
		
		//스캐너로 반지름과, 높이 값을 입력 받음
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		//원주율 값을 넣을 변수를 만들어 준다 
		double c = 3.14;
		
		//원주율 * 반지름 * 높이 값을 넣어줄 변수를 만들어준다.
		double sum = c*a*a*b;
		
		System.out.println("원기둥 부피의 값은 "+ sum +"입니다");
		
		
		
		
		
		
		
		
	}

}
