package exam03;

public class PhoneTest {

	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 s23";
		myPhone.value = 150;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "아이폰 14";
		yourPhone.value = 140;
		yourPhone.print();

	}

}
