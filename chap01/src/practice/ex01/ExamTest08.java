package practice.ex01;

import java.util.Scanner;

public class ExamTest08 {
	/*
	 * 09. 대학을 졸업하려면 최소 140학점을 이수해야 한다고 하자. 이수한 학점 중 
		전공은 70학점 이상이어야 하며,
		교양과 일반은 각각 30학점 이상이거나 두 영역이 80학점 이상이어야 한다. 
		이수한 세 개의 학점을 각각 키보드로 입력받아 졸업 여부를 출력하는 프로그램을 작성하라.
		
		  - 전공 이수 학점 : 75
		  - 교양 이수 학점 : 70
		  - 일반 이수 학점 : 10
		  졸업가능
	 */
	public static void main(String[] args) {
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		
		System.out.print("전공 이수 학점 : ");
		Scanner scanner1 = new Scanner(System.in);
		score1 = scanner1.nextInt();
		
		System.out.print("교양 이수 학점 : ");
		Scanner scanner2 = new Scanner(System.in);
		score2 = scanner2.nextInt();
		
		System.out.print("일반 이수 학점 : ");
		Scanner scanner3 = new Scanner(System.in);
		score3 = scanner3.nextInt();
		
		System.out.println(score1 + ", " + score2 + ", " + score3);
		System.out.println(score1 + score2 + score3);
		
		// 최소 140학점을 이수해야함
		// 전공은 70학점 이상이어야 하며,
		// 교양과 일반은 각각 30학점 이상이거나 두 영역이 80학점 이상이어야 
		if(score1 + score2 + score3 >= 140 && score1 >= 70 &&
		((score2 >= 30 && score3 >= 30) || (score2 + score3 >= 80)) ){
			System.out.println("졸업가능");
		} else {
			System.out.println("졸업 불가능");
		}
	}
}
