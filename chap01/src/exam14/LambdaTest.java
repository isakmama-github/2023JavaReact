package exam14;

@FunctionalInterface
interface Negative { int neg(int x);}

@FunctionalInterface
interface Printable { void print();} 

public class LambdaTest {

	public static void main(String[] args) {
		Negative n;
		Printable p;
		
		n = new Negative() {
			@Override
			public int neg(int x) {
				return -x;
			}
		};
		
		n = (int x) -> { return -x; };
		n = (x) -> {return -x;};
		n = x -> -x;
		
		p = new Printable() {
			@Override
			public void print() {
				System.out.println("Hello!");
			}
		};
		
		p = () -> { System.out.println("Hello!");};
		p = () -> System.out.println("Hello!");

		
	}

}
