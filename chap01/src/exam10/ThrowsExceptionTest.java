package exam10;

public class ThrowsExceptionTest {

	public static void main(String[] args) throws Exception{
//		try {
//			findClass();
//		} catch (ClassNotFoundException e) {
//			System.out.println("클래스가 존재하지 않아요.");
//		}
		
		findClass();

	}

	private static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
		
		
	}

}
