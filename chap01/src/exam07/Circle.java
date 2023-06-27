package exam07;

public class Circle extends Shape{
	
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("원을 그립니다");
		
	}
	
	public double findArea() {
		return pi * radius * radius;
	}

}
