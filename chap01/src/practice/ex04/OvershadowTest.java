package practice.ex04;

public class OvershadowTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child  c = new Child();
		
		p.print();
		c.print();
		
		p.name = "홍길동";
		c.name = "김철수";
		
		p.print();
		c.print();

	}

}
