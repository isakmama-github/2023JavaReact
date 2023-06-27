package exam05.ex01;

public class Car {
	
	static int speed;
	
	static void run() {
		System.out.println(speed+"로 달립니다.");
	}
	

	public static void main(String[] args) {
//		Car myCar = new Car();
//		myCar.speed = 60;
//		myCar.run();
		
		speed = 60;
		run();
		
	}

}
