package practice.ex04;

public class Child extends Parent{
	public String name = "사도세자";
	
	@Override
	public void print() {
		System.out.println("Child name : " + name);
	}
}
