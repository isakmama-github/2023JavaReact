package exam02;

import java.util.Scanner;

public class ArrayScore02 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("학생수를 입력하세요 : ");
        int n = sc.nextInt();
        
        int[] scores = new int[n];
        
        for(int i=0; i<n; i++) {
            scores[i] = sc.nextInt(); 
        }
        
		int sum = 0;
        for(int i=0; i<n; i++) {
        	sum += scores[i];
        }
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum / n);
	}

}
