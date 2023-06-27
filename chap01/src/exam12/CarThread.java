package exam12;

public class CarThread extends Thread{
	private String who;
	private SharedCar car;
	private String where;
	
	public CarThread(String who, SharedCar car, String where) {
		this.who = who;
		this.car = car;
		this.where = where;
	}
	
	@Override
	public void run() {
		car.drive(who, where);
	}

}
