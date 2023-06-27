package practice.ex01;

import java.util.Scanner;

public class JavaExam08 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("전공 이수 학점을 입력 해주세요 :");
		int maj =sc.nextInt();
		
		System.out.print("교양 이수 학점를 입력 해주세요 :");
		int cul =sc.nextInt();
		System.out.print("일반 이수 점수를 입력 해주세요 :");
		int gen =sc.nextInt();
		
		if(maj >=70) {
			if(cul<=30 || gen<=30) {
				System.out.println("교양 또는 일반 학점이 부족합니다");
			}else if(cul+gen<= 80) {
				System.out.println("교양 또는 일반 학점이 부족합니다");
			}else {
				System.out.println("졸업 가능");
			}
		}else {
			System.out.println("전공학점이 부족합니다.");
		}
		
		
		
		
	}

}
