package exam05;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		//circle.radius = -10.0;
		circle.setRadius(20.0);
		
		circle.show(circle.getRadius(), circle.findArea());
	}

}
