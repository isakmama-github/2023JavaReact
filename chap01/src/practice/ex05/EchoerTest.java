package practice.ex05;

import java.util.Scanner;

public class EchoerTest extends Echoer {
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	void printMessage() {
		System.out.println("시작합니다.");
		while(true){
			String message = sc.nextLine();
			System.out.println(message);
				if(message.trim().equals("끝")) {
				System.out.println("종료합니다.");
				break;
				}
		}
	}


public static void main(String[] args) {
		
	EchoerTest ech = new EchoerTest();
		ech.printMessage();

	}
}




