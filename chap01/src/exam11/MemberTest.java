package exam11;

public class MemberTest {

	public static void main(String[] args) {
		Member obj1 = new Member("car");
		Member obj2 = new Member("car");
		Member obj3 = new Member("bike");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		if (obj1.equals(obj2)) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
		if (obj1.equals(obj3)) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
	}

}
