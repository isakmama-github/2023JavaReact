package practice.ex03;

import java.util.Scanner;

public class JavaExam01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("골프채의 개수를 입력하세요 : ");
		int sci = sc.nextInt();
		sc.nextLine();
		String[] club = new String[sci];
		for (int i = 0; i< club.length; i++) {
			System.out.print("골프채의 종류는 : ");
			String scs = sc.nextLine();
			club[i] = scs;
		}

		String gcs = sc.nextLine();
		
		int gci = sc.nextInt();
		
		for (int i=0; i<sci; i++) {
			if(gcs.equals(club[i])) {
				System.out.println(i+"번 "+club[i]+"입니다");
				break;
			}else if(gcs.equals(club[i+1])) {
				System.out.println(i+1+"번 "+club[i+1]+"입니다");
				break;
			}
		 else if(gcs.equals(club[i+2])) {
			System.out.println(i+2+"번 "+club[i+2]+"입니다");
			break;
		}
		 else if(gcs.equals(club[i+3])) {
			 System.out.println(i+3+"번 "+club[i+3]+"입니다");
			 break;
		 }
		else {
				System.out.println("그런 골프채는 없는데용?");
				break;
			}
		}

		for (int i = 0; i <= gci; i++) {
			if (gci == i) {
				System.out.println(i+"번 "+club[i] + "입니다.");
				break;
			} else {
				System.out.println(gci+"번 "+club[gci] + "입니다.");
				break;
			}

		}

	}

}
