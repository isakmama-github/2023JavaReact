package exam02;

import java.util.Scanner;

public class ArrayScore01 {

	public static void main(String[] args) {
//		int score1 = 80;
//		int score2 = 95;
//		int score3 = 99;
//		int score4 = 88;
//		int score5 = 90;
		
        Scanner sc = new Scanner(System.in);
		
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		int score4 = sc.nextInt();
		int score5 = sc.nextInt();

		int sum = score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum / 5.0);
		
		sum = 0;
//		int[] scores = {score1, score2, score3, score4, score5};
	    
		int[] scores;
		scores = new int[]{score1, score2, score3, score4, score5};
		
	    System.out.println(scores[0]);
	    
	    for(int i=0;i<scores.length;i++) {
	    	sum += scores[i];
	    	
	    }
	    System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum / 5.0);
	}

}
