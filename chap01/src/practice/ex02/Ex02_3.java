package practice.ex02;

import java.util.Scanner;

public class Ex02_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;
		int sum = 0;
	
		do {
			num = sc.nextInt();
			if(num % 2 ==0) {
				sum+=num;
			}
			
			}while(num>0);
		
		System.out.println(sum);
		
		sc.close();
		}

	}


