package exam11;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		Key obj3 = new Key(1);
		SmartPhone obj4 = new SmartPhone("구글", "안드로이드");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		String str = obj4.toString();
		System.out.println(str);
		
		System.out.println(obj4);

	}

}
