package practice.ex01;

import java.util.Scanner;

public class EX01 {	
	public static void main(String[] args) {
	
	System.out.print("정수를 입력하세요.: ");
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt(); 
	
	System.out.println(n + "의 제곱은 " + n*n );

	}
}