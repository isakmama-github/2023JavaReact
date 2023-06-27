package exam05;

public class Circle {
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		if (radius>0) {
			this.radius = radius;
		} else { 
			this.radius = 10;
			System.out.println("반지름이 0보다 작은값은 10으로 세팅됩니다.");
		}
	}
	
	double findArea() {
		return Math.PI * radius * radius;
	}
	
	void show(double x, double y) {
		System.out.println("반지름 ="+x + ", "+" 넓이 =" + y);
	}

}
