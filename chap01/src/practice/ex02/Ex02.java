package practice.ex02;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		System.out.print("당신의 등수를 입력하십시오. : ");
		Scanner b = new Scanner(System.in);
		int num = b.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("아주 잘했습니다!");
			break;
		case 2:
		case 3:
			System.out.println("보통입니다.");
			break;
		default:
			System.out.println("노력하겠습니다.");
		}

	}

}