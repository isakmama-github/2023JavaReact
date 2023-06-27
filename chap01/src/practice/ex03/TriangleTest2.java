package practice.ex03;

public class TriangleTest2 {
	public static void main(String[] args) {
		Triangle2 t1 = new Triangle2(10,60);
		Triangle2 t2 = new Triangle2(10,50);
		System.out.println(t1.area());
		System.out.println(t2.area());
		Triangle2.isSameArea(t1.area(), t2.area());
		
	}

}
