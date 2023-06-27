package exam12;

public class CarShareTest {

	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		
		new CarThread("김자바", car, "서울").start();
		new CarThread("이자바", car, "부산").start();
		new CarThread("박자바", car, "울산").start();

	}

}
