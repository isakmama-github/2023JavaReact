package exam07;

public class Rectangle extends Shape{
	
	int width;
	int height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public double findArea() {
		return width * height;
	}

	@Override
	void draw() {
		System.out.println("사각형을 그립니다.");
		
	}

}
