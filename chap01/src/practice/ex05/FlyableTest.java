package practice.ex05;

public class FlyableTest {
	public static void main(String[] args) {
		Flyable fla = new Flyable() { //인터페이스 타입에 변수를 주고 new해서 Flyable 만듬 인터페이스를 직접 구현하였음.
			
			@Override
			public void speed() {
				System.out.println("속도 :" + 100 + "Km/h");
				
			}
			
			@Override
			public void height() {
				System.out.println("높이 :" + 2000 +"M");
				
			}
		};
		
		fla.speed(); // 호출
		fla.height(); //호출
	}

}
