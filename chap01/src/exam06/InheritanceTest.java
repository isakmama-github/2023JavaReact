package exam06;

public class InheritanceTest {

	public static void main(String[] args) {
		//Circle c1 = new Circle();
		Ball c2 = new Ball("그린");
		
		System.out.println("원 : ");
		//c1.findRadius();
		//c1.findArea();
		
		System.out.println();
		System.out.println("공 : ");
		c2.findRadius();
		c2.findArea();
		c2.findColor();
		c2.findVolumn();
		
	}

}
