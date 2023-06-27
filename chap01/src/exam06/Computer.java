package exam06;

public class Computer extends Calculator{
	
	@Override
	double areaCircle(double r ) {
		System.out.println("자식객체의 메소드 areaCircle");
		return Math.PI * r * r;
	}

}
