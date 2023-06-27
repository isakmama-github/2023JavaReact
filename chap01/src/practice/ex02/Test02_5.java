package practice.ex02;

public class Test02_5 {

	public static void main(String[] args) {
		//각 변의 길이의 합이 20이하이며 직각삼각형을 만족하는 모든 변의 길이를 구하는 프로그
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				for(int k=1; k<=10; k++) {
					if(i+j+k<=20 && i*i+j*j == k*k) {
						System.out.printf("각 변의 길이는 가로: %d, 세로: %d, 빗변: %d\n", i, j, k);
					}
				}
			}
		}
	}

}
