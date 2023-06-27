package practice.ex03;

public class Car {

	// static 변수로 선언해서 계속 사용할 수 있게 함
	private static int carNum=0;
	private static int blackCarNum=0;
	private static int redCarNum=0;
	
	// 생성자를 호출할때 모든자동차의 갯수와 입력받은 색의 갯수를 추가함
	Car(String color) {
		carNum++;
		if (color.equals("검정색"))
			blackCarNum++;
		else if (color.equals("빨간색"))
			redCarNum++;
	}
	
	
	// 출력 메소드
	void printAllCarNum() {
		System.out.println("생산된 자동차 수 : " + carNum);
	}
	void printAllRedCarNum() {
		System.out.println("빨간색 자동차 수 : " + redCarNum);
	}
	void printAllBlackCarNum() {
		System.out.println("검정색 자동차 수 : " + blackCarNum);
	}
}
