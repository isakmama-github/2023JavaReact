package exam06;

public class UpcastTest {

	public static void main(String[] args) {
		Person p;
		Student2 s = new Student2();
		Person p2 = new Person();
		
		//s = (Student2)p2;

		p = s;
		s = (Student2)p;   // 강제 형변환
		
		//Student2 s2 = new Person();   // error
		
		p.whoami();
		//p.work();  //사용불가
		s.whoami();
		s.work();
		
	}

}
