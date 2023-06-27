package practice.ex04;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phones[] = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("대한이", "갤러그") };

		for (Phone p : phones) {
			if (p instanceof Smartphone) {
				Smartphone phone = (Smartphone) p;
				phone.playGame();
			}
			else if (p instanceof Telephone ) {
				Telephone phone = (Telephone) p;
				phone.autoAnswering();
			} else {
				p.talk();
			}
		}
	}

}
