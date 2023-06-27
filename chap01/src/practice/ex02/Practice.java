package practice.ex02;

import java.util.Random;
import java.util.Scanner;
//import java.util.ArrayList;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1
		System.out.println(isAdult(sc));
		
		//2
		System.out.println(estmation(sc));
		
		//3
		System.out.println(sumEven(sc));

		//4
		printStar();
		
		//5
		rightAngled();
		
		//6
		System.out.printf("승자는 %s\n", rsp(sc));
	
	}
	
	public static String isAdult(Scanner sc) {
		System.out.println("나이? ");
		int age = sc.nextInt();
		if(age>=19) return "성년";
		else return "미성년";
//		return age>=19? "성년" : "미성년"; 
	}
	
	public static String estmation(Scanner sc) {
		System.out.println("등수? ");
		int grade = sc.nextInt();
		switch(grade) {
			case 1 : return "아주 잘했습니다.";
			case 2 :
			case 3 : return "보통";
			default : return "노력";
		}
	}
	
	public static int sumEven(Scanner sc) {
		int sum = 0;
		int input = 0;
		do {
			System.out.println("숫자 입력 : ");
			input = sc.nextInt();
			sum += input%2 == 0 ? input : 0;
			System.out.println(sum);
		}while(input>0);
		return sum;
	}
	
	public static void printStar() {
		System.out.println("별 출력하기");
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void rightAngled() {
		System.out.println("직각 삼각형 a,b,c 출력");
		int num = 20;
		int[] numList = new int[num];
//		ArrayList<Integer> numList = new ArrayList<>();
		for(int i = 0; i<num; i++) {
			numList[i] = i+1;
//			numList.add(i+1);
		}
		boolean bool = false;
		for(int i : numList) {
			for(int j : numList) {
				for(int k : numList) {
					bool = (i*i)+(j*j) == k*k? i+j+k <= 20? true: false : false;
					if(bool) System.out.printf("a = %d, b = %d, c = %d  (a^2 + b^2 = %d, c^2 = %d)\n",i ,j, k, sPow(i)+sPow(j), sPow(k));
				}
			}
		}
	}
	
	public static String rsp(Scanner sc) {
		sc.nextLine();
		System.out.println("가위(s), 바위(r), 보(p)?");
		String str = sc.nextLine();
		String[] rsp = {"r","s", "p"};
		Random rand = new Random();
		int randNum = rand.nextInt(3);
		String winner = "";
		switch(str) {
			case "r" : winner = rsp[randNum].equals("p") ? "영희" : rsp[randNum].equals("r") ? "무승부" : "철수";
				break;
			case "s" : winner = rsp[randNum].equals("r") ? "영희" : rsp[randNum].equals("s") ? "무승부" : "철수";
				break;
			case "p" : winner = rsp[randNum].equals("s") ? "영희" : rsp[randNum].equals("p") ? "무승부" : "철수";
				break;
			default : winner = "r, s, p를 제외한 값";
		}
		System.out.printf("영희는 %s \n", rsp[randNum] == "r" ? "주먹" :  rsp[randNum] == "s" ? "가위" : "보");
		return winner;
	}
	
	public static int sPow(int i ) {
		return i*i;
	}
	
}
