package exam07;

public class PhoneTest {

	public static void main(String[] args) {
//		Phone phone = new Phone();
		
		SmartPhone myPhone = new SmartPhone("홍길동");
		
		myPhone.turnOn();
		myPhone.internetSearch();
		myPhone.turnOff();
	}

}
