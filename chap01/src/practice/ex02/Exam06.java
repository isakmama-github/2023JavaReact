package practice.ex02;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 : ");
		String cs = sc.nextLine();
		System.out.print("영희 : ");
		String yh = sc.nextLine();

		switch (cs) {
		case "r":
			if (yh.equals("r")) {
				System.out.println("무승부");
			} else if (yh.equals("s")) {
				System.out.println("철수 승");
			} else if (yh.equals("p")) {
				System.out.println("영희 승");
			}
			break;
		case "s":
			if (yh.equals("r")) {
				System.out.println("영희 승");
			} else if (yh.equals("s")) {
				System.out.println("무승부");
			} else if (yh.equals("p")) {
				System.out.println("철수 승");
			}
			break;
		case "p":
			if (yh.equals("r")) {
				System.out.println("철수 승");
			} else if (yh.equals("s")) {
				System.out.println("영희 승");
			} else if (yh.equals("p")) {
				System.out.println("무승부");
			}
			break;
		}

	}
}