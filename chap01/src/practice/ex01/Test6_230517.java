package practice.ex01;

import java.util.*;

public class Test6_230517 {

	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		if(n%4 == 0 && n%5 == 0) {
			System.out.println("4와 5로 나뉘어집니다: True");
		}else {
			System.out.println("4와 5로 나뉘어집니다: False");
		}
		if(n%4 == 0 || n%5 == 0) {
			System.out.println("4또는 5로 나뉘어집니다: True");
		}else {
			System.out.println("4또는 5로 나뉘어집니다: False");
		}
		if(n%4 == 0 ^ n%5 == 0) {
			System.out.println("4또는 5로 나뉘어지지만 둘 다로 나뉘어지진 않습니다: True");
		}else {
			System.out.println("4또는 5로 나뉘어지지만 둘 다로 나뉘어지진 않습니다: False");
		}
	}

}
