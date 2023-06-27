package practice.ex05;

public class HumanTest {

	public static void main(String[] args) {
		Student st =new Student(20);
		Worker wo =new Worker();

		Human.echo();
		st.print();
		st.eat();
		
		wo.print();
		wo.eat();
	}
}
