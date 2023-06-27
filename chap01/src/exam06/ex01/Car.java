package exam06.ex01;

public class Car {
	public int speed;
	
	public final void start() {
		System.out.println("출발합니다.");
	}
	
	protected void speedUp() {
		speed += 1;
	}
	
	void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
