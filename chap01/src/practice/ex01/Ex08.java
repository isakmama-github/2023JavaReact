//대학을 졸업하려면 최소 140학점을 이수해야 한다고 하자. 이수한 학점 중 전공은 70학점 이상이어야 하며, 
//교양과 일반은 각각 30학점 이상이거나 두 영역이 80학점 이상이어야 한다. 이수한 세 개의 학점을 각각 키보드로 입력받아 졸업 여부를 출력하는 프로그램을 작성하라.
//
//  - 전공 이수 학점 : 75
//  - 교양 이수 학점 : 70
//  - 일반 이수 학점 : 10
//  졸업가능

package practice.ex01;
import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		int sum;
		int x = 0, y = 0, z = 0;
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		System.out.println("전공학점을 입력하세요");
		x = input1.nextInt();
		
		System.out.println("교양학점을 입력하세요");
		y = input2.nextInt();
		
		System.out.println("일반학점을 입력하세요");
		z = input3.nextInt();
		
		sum = x + y + z;
		
		if(sum >= 140 && x >= 70) {
			if(y >= 30 && z >= 30 || y + z >= 80) 
				System.out.println("졸업 요건을 충족했습니다.");
		
			else
			System.out.println("졸업 요건을 채우지 못했습니다.");
		}
		else
			System.out.println("졸업 요건을 채우지 못했습니다.");
			
		input1.close();
		input2.close();
		input3.close();
	}

}
