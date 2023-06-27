package practice.ex03;

public class Triangle2 {
	
	//2개의 삼감형의 넓이가 동일한지 비교하는 isSameArea()
	//필드
	int a; 
	int b;
	
	//생성자
	Triangle2(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	//넓이를 구하는 메서드
	public int area() {
		int area = a*b/2;
		System.out.println("삼각형의 넓이는 "+area+"입니다.");
		return area;
	}
	
	//넓이가 동일한지 비교하는 메서드
	public static void isSameArea(int a, int b) {
		if(a==b) {
			System.out.println("두 삼각형의 넓이는 동일합니다.");
		}else {
			System.out.println("두 삼각형의 넓이는 다릅니다.");
		}
		
		
	}
	
}
