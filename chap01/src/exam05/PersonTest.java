package exam05;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
//		p1.nation = "미국";
//		p1.ssn = "456789-1234567";
		p1.name = "김자바";
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

	}

}
