package exam06;

public class ChildTest {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		Parent p1 = new Child();
		Parent p2 = child;
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(child);
		
		
		parent.method2();
		child.method2();
		p1.method2();
//		p1.method3();

	}

}
