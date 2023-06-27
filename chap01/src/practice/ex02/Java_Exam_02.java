package practice.ex02;

import java.util.Scanner;

public class Java_Exam_02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int qNum;
		int n1, n2, n4, n5;
		
		
	
		do {
			
		System.out.print("문제 번호를 입력하세요(종료는 0) : ");
		qNum = in.nextInt();
		in.nextLine();
		
		switch (qNum) {
		
		case 1:
			n1 = in.nextInt();
			if (n1>=19) {
				System.out.println("성년");
			} else {
				System.out.println("미성년");
			}
			break;
		case 2:
			n1 = in.nextInt();
			switch (n1) {
			case 1:
				System.out.println("아주 잘했습니다");
				break;
			case 2:
			case 3:
				System.out.println("보통입니다");
				break;
			default:
				System.out.println("노력하겠습니다");
			}			
			break;
		case 3:
			n1=0;
			do {
				n2 = in.nextInt();
				if (n2%2==0) {
					n1+=n2;
				}				
			} while (n2>0);
			System.out.println("입력된 양의정수 중 짝수의 총합 : " + n1);
			break;
		case 4:
			for (int i=0; i<5; i++) {
				for (int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			break;
		case 5:
			n5=20;
			n4=0;
	
			for (int i=1; i<=n5-2; i++) {
				for (int j=1; j<=n5-2; j++) {
					for (int k=1; k<=n5-2; k++) {
						if (i+j+k<=n5 && (i*i+j*j==k*k || i*i+k*k==j*j || j*j+k*k==i*i)) {
							n4++;
						}
					}
				}
			}
			int[][] abc = new int[n4][3];
			n4=0;
			for (int i=1; i<=n5-2; i++) {
				for (int j=1; j<=n5-2; j++) {
					for (int k=1; k<=n5-2; k++) {
						if (i+j+k<=n5 && (i*i+j*j==k*k || i*i+k*k==j*j || j*j+k*k==i*i)) {
							abc[n4][0] = i;
							abc[n4][1] = j;
							abc[n4][2] = k;
							n4++;
						}
					}
				}
			}
			
			for (int i=0; i<abc.length; i++) {
				System.out.print("삼각형의 변의 각 길이 : ");
				for (int j:abc[i]) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			break;
		case 6:
			System.out.print("철수 : ");
			String cs = in.nextLine();
			System.out.print("영희 : ");
			String yh = in.nextLine();
			if (cs.equals(yh)) {
				System.out.println("무승부!");
			} else {
				if ("sp".equals(cs+yh) || "rs".equals(cs+yh) || "pr".equals(cs+yh)) {
					System.out.println("철수, 승!");
				}
				if ("sr".equals(cs+yh) || "rp".equals(cs+yh) || "ps".equals(cs+yh)) {
					System.out.println("영희, 승!");
				}				
			}
			break;
		case 0:
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("문제가 없습니다.");			
		}
		
		
		} while (qNum>0) ;
		
		in.close();
		
	}
}
