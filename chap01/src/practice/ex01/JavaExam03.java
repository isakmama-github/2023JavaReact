package practice.ex01;

import java.util.Scanner;

public class JavaExam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int second = sc.nextInt();
		System.out.println("초 단위 정수를 입력하세요 : "+second);
		int hour = second/3600;
		int min = second%3600/60;
		int s = second%60;
		System.out.println(hour+"시간 "+min+"분 "+s+"초");
		

	}

}
