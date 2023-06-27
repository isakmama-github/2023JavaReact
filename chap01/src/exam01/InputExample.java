package exam01;

import java.io.IOException;
import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) throws IOException {
//		int keyCode = System.in.read();
//		System.out.println(keyCode);
		int i = 10;
		boolean result = (i==10);
		System.out.println(result);
		
		Scanner scanner = new Scanner(System.in);
		String inputData = scanner.nextLine();
		int num = scanner.nextLine().charAt(i);
		boolean result1 = (inputData == "10");
		System.out.println(inputData);
		System.out.println(result1);
		boolean result2 = (inputData.equals("10"));
		System.out.println(result2);
		
	}

}
