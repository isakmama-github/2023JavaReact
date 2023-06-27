package practice.ex01;

import java.util.Scanner;

public class Java_Exam_01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int qNum;
		int n1, n2, n3;
		double d1;
		char c1, c2;
		
		
		
		do {
			
		System.out.print("문제 번호를 입력하세요(종료는 0) : ");
		qNum = in.nextInt();
		
		switch (qNum) {
		
		
		case 1:
			System.out.print("정수를 입력하세요 : ");
			n1 = in.nextInt();
			n2 = n1*n1;
			System.out.println(n1 + "의 제곱은 " + n2 + "입니다.");
			break;
		case 2:
			System.out.print("원기둥의 밑면 반지름을 입력하세요 : ");
			n1 = in.nextInt();
			System.out.print("원기둥의 높이를 입력하세요 : ");
			n2 = in.nextInt();
			d1 = 3.14 * n1 * n1 * n2;
			System.out.println("원기둥의 부피는 " + d1 + "입니다");			
			break;
		case 3:
			System.out.print("시간분초 로 변환할 초(second)를 입력하세요 : ");
			n1 = in.nextInt();
			n2 = 0;
			n3 = 0;
			if (n1/60 >= 1) { // 1분이상인가 체크후 1분이상이면 n2에 에 총 몇분인지 저장
				n2 = n1/60;
			}
			if (n2/60 >= 1) { // 총 분수(n2)에서 1시간이상인지 체크후 1시간이상이면 n3에 몇시간인지 저장
				n3 = n2/60;
			}
			n2 = n2%60; // n2에 1시간이상을 제외한 남은 분 수만 저장
			n1 = n1%60; // n1에 1분 이상을 제외한 남은 초 수만 저장
			System.out.printf("%d시간 %d분 %d초 입니다.\n", n3, n2, n1);
			break;
		case 4:
			c1 = 'e' ;
			if (c1<'a' || c1>'z') {
				System.out.println("소문자가 아닙니다!! 처음부터 다시해주세요");
				break;
			}
			else {
				c2 = (char) (c1 + ('A' - 'a'));
				System.out.println(c1 + "을 대문자로 바꾼결과 : " + c2);
			}
			break;
		case 5:
			System.out.print("섭씨온도(C)로 변환할 화씨온도(F)를 입력해 주세요 : ");
			n1 = in.nextInt();
			d1 = (n1-32)*(5.0/9.0); // 5/9 는 인트값으로 저장되어 0이되니 5.0 이나 9.0으로 더블값으로 저장되게 해줘야함
			System.out.printf("화씨온도(F) %d => 섭씨온도(C) %.2f 입니다.\n", n1, d1);
			break;
		case 6:
			System.out.print("정수를 입력해 주세요 : ");
			n1 = in.nextInt();
			System.out.print("4와 5로 나누어지는가 : ");
			if (n1%4==0 && n1%5==0) {
				System.out.println("True");
			} else {
				System.out.println("Flase");
			}
			System.out.print("4또는 5로 나누어지는가 : ");
			if (n1%4==0 || n1%5==0) {
				System.out.println("True");
			} else {
				System.out.println("Flase");
			}
			System.out.print("4나5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는가 : ");
			if ((n1%4==0 && n1%5!=0) || (n1%4!=0 && n1%5==0)) {
				System.out.println("True");
			} else {
				System.out.println("Flase");
			}
			break;
		case 7:
			System.out.print("0~999 사이의 정수를 입력해 주세요 : ");
			n1 = in.nextInt();
			n2 = n1/100 + n1%100/10 + n1%10;
			System.out.println("각 자릿수의 합 : " + n2 + "입니다.");
			break;
		case 8:
			System.out.print("전공 이수 학점을 입력해 주세요 : ");
			n1 = in.nextInt();
			System.out.print("교양 이수 학점을 입력해 주세요 : ");
			n2 = in.nextInt();
			System.out.print("일반 이수 학점을 입력해 주세요 : ");
			n3 = in.nextInt();
			
			if (n1+n2+n3>=140 && n1>=70 && ((n2>=30 && n3>=30) || (n2+n3>=80))) {
				System.out.println("졸업 가능");
			} else {
				System.out.println("졸업 불가능");
			}
			break;
		case 9:
			n1=1;
			while (n1<=100) {
				System.out.println(n1++);
			}
			do {
				System.out.println(--n1);
			} while (n1>1);
			break;
		case 10:
			n1=1; // n1을 1로 초기화
			n2=0; // n2를 0으로 초기화
			while (n1<=100) { // n1이 100이하일때 돌아감
				if (n1%2==0 && n1%7==0) { // 2의배수 그리고 7의배수일때만 중괄호 안을 실행함
					System.out.println(n1); // 해당숫자를 출력
					n2+=n1; // n2에 해당숫자를 계속 더함
				}
				n1++; // n1을 1씩 증가시켜줌
			}
			System.out.println("1~100의 수중에 2의배수이고 7의배수인 수의 총합 : " + n2);
			break;
		case 11:
			n1=1;
			while (n1<9) { // 8단까지 이므로 1로초기화한 n1을 9미만까지 사용함
				if (n1%2==0) { // 2의 배수일때만 사용함
					for (int i=1; i<=n1; i++) { // for문에서 i를 n1(단수)까지만 이용함
						System.out.printf("%d x %d = %d\n", n1, i, n1*i);
					}
				}
				n1++;
			}
			break;
		case 12:
			n1=1;
			while ( n1<10 ) { // n1을 1~9까지 사용
				n2=1;
				while ( n2<10 ) { // n2를 1~9까지 사용
					if ((n1*10+n2) + (n2*10+n1) == 99) { // 문재내용 그대로 if문작성
						System.out.printf("A = %d / B = %d \n", n1, n2);
					}
					n2++;
				}
				n1++;
			}
			break;
		case 0:
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("문제가 없습니다.");
		}
		
		
		} while (qNum>0);
		
		in.close();
		
	}
	
}
