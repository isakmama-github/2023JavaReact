package practice.ex04;

public class ColoredCircle extends Circle{

	//필드
	String color;
	
	//생성자
	public ColoredCircle(int radius, String color){
		super(radius);  //간략화 할 수 있음. 원래 무조건 들어감
//		this.radius=radius;
		this.color=color;
	}
	
	//메서드
	void show() {
		System.out.println("반지름이 "+radius+"인 "+ color +" 원이다.");
	}
}
