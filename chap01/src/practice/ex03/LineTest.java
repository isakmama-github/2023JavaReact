package practice.ex03;

public class LineTest {

	public static void main(String[] args) {
		Line line = new Line();
		Line l1 = new Line(0);
		Line l2 = new Line(10);
		Line l3 = new Line(20);
		Line l4 = new Line(100);
		Line l5 = new Line(50);
		
		//첫번째, 매개변수를 연속으로 받아 배열로 처리 후 최대값 출력
		if(line.whichIsLong(l1.getLength(), l2.getLength(), l3.getLength(), l4.getLength(), l5.getLength()) == -1) {
			System.out.println("직선이 없습니다.");
		}else {
			System.out.printf("길이가 %d인 직선이 가장 깁니다.\n", line.whichIsLong(l1.getLength(), l2.getLength(), l3.getLength(), l4.getLength(), l5.getLength()));
		}
		
		//두번째, static 변수를 활용해 최대값 출력
		if(line.whichIsLong() == -1) {
			System.out.println("직선이 없습니다.");
		}else {
			System.out.printf("길이가 %d인 직선이 가장 깁니다.\n", line.whichIsLong());
		}
	}

}
