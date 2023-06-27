package exam11;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Key.class;
		Class clazz2 = Class.forName("exam11.Key");
		
		Key key = new Key(1);
		Class clazz3 = key.getClass();
		
		System.out.println(clazz);
		System.out.println(clazz.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz3.getPackageName());
		System.out.println(clazz3.getPackage().getName());
	}

}
