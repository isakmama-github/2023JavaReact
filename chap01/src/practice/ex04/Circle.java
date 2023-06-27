package practice.ex04;

public class Circle {
	
	//필드
	int radius;
	
	//생성자
	Circle(){}
	Circle(int radius){
		this.radius=radius;
	}

	
	//메서드
	void show() {
		System.out.println("반지름이 "+radius+"인 원이다.");
	}

}
