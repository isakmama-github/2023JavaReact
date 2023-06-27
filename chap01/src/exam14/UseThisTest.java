package exam14;

import java.util.Comparator;

interface UseThis { void use();}

public class UseThisTest {
	
	public void lambda() {
		String hello = "Hello!";
		UseThis u1 = new UseThis() {
			@Override
			public void use() {
				System.out.println(this);
				System.out.println(hello);
				//hello = "Anonymnous";
			}
		};
		
		u1.use();
		
		UseThis u2 = () -> {
			System.out.println(this);
			System.out.println(hello);
			//hello = "lambda";
		};
		u2.use();
		
	}
	
	public String toString() {
		return "UseThisTest";
	}

	public static void main(String[] args) {
		int one = 1;
		
		new UseThisTest().lambda();
		//Comparator<String> c = (one, two) -> one.length() - two.length();
		Comparator<String> c = (s1, s2) -> s1.length() - s2.length();

	}

}
