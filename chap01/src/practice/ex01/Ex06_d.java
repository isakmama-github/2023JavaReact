//키보드로 정수를 입력받아 1) 4와5로 나누어지는지, 2) 4또는5로 나누어지는지, 3) 4나5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는지를 true/false로 출력하는 프로그램을 작성하라.


package practice.ex01;
import java.util.Scanner;
public class Ex06_d {

	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if (input % 4 == 0 && input % 5 == 0) 
			System.out.println("1. 4와 5로 나누어지는지 : true");
			else
				System.out.println("1. 4와 5로 나누어지는지 false");			
		if (input % 4 == 0 || input % 5 == 0) 
			System.out.println("2. 4 또는 5로 나누어지는지 : ture");
			else
				System.out.println("2. 4 또는 5로 나누어지는지 : false");
		if (input % 4 == 0 || input % 5 == 0) {
			if (input % 4 != 0 && input % 5 !=0) 
				System.out.println("3. 4나5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는지 : ture");
			else
				System.out.println("3. 4나5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는지 : false");
		}
		else
			System.out.println("3. 4또는 5로 나누어지는지 : false");
		scanner.close();
	}

}
