package practice.ex03;


public class TriangleTest {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		Triangle triangle2 = new Triangle();
		
		triangle.setbese(15);
		triangle2.setbese(5);
		triangle.setheight(10);
		triangle2.setheight(30);
		triangle.findtriangle();
		System.out.println(triangle.findtriangle());

		triangle2.findtriangle();
		System.out.println(triangle2.findtriangle());
		
		boolean area = triangle.isSameArea(triangle2);
		System.out.println(area);
		
		if(area) {
			System.out.println("두 삼각형의 넓이가 같습니다.");
		}else {
			System.out.println("두 삼각형의 넓이가 다릅니다.");
		}
		
		triangle.show(triangle.getbese(), triangle.getheight()
				, triangle.findtriangle());
		triangle2.show(triangle2.getbese(), triangle2.getheight(),
				triangle2.findtriangle());
	
	}

}
