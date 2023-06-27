package practice.ex03.ex01;

public class LineTest {

	public static void main(String[] args) {
		Line li = new Line();
		li.lenght = 100;
		Line l2 = new Line();
		li.lenght = 50;
		
		if(li.isComp(l2)) {
			System.out.println("li의 길이가 더 깁니다.");
		}
		else
			System.out.println("li의 길이가 더 짧습니다.");
	}

}
