package exam08;

public class MemberTest {
	
	class Eagle extends Bird{
		public void move() {
			System.out.println("독수리가 날아요.");
		}
		
		public void sound() {
			System.out.println("휘익~~~");
		}
	}
	
	Eagle eagle = new Eagle();

	public static void main(String[] args) {
		MemberTest m = new MemberTest();
		m.eagle.move();
		m.eagle.sound();

	}

}
