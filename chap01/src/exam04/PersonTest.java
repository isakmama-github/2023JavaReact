package exam04;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("Kim", "011101-1111111", "M10101");
		Person p2 = new Person("Lee", "011101-1111111");
		String name = p1.showInfo();
		System.out.println(name);
		p2.showInfo();
	}
}
