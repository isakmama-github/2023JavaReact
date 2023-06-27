// 길이 속성만 가진 직선을 모델링한 Line 클래스를 작성하고, 길이를 비교하는 메소드를 추가한 후 LineTest 클래스를 작성해 테스트하시오.

package practice.ex03.ex01;

public class Line {
	int lenght;
	
	Line(){}
	
	public boolean isComp(Line line) {
		if(this.lenght > line.lenght)
			return true;
		else
			return false;
	}
}
