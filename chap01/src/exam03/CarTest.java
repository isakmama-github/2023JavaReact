package exam03;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("제작회사 : " + myCar.campany);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 100;
		System.out.println("현재속도 : " + myCar.speed);
		
		Car yourCar = new Car("그린", 150);
		System.out.println(yourCar.campany);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		System.out.println(yourCar.speed);
		

	}

}
