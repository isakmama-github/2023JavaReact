package practice.ex05;

public class BookTest {

	public static void main(String[] args) {
		 Book[] b = new Book[3];
		 b[0] = new Book(15000);
		 b[1] = new Book(50000);
		 b[2] = new Book(20000);
		 
		 for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
