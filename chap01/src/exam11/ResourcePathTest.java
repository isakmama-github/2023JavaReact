package exam11;

public class ResourcePathTest {

	public static void main(String[] args) throws ClassNotFoundException {
//		Class<Key> clazz = Key.class;
//		Class clazz = Key.class;
//		Class clazz = Class.forName("exam11.Key");
		Key key = new Key(1);
		Class clazz = key.getClass();
		
		String path1 = clazz.getResource("photo1.jpg").getPath();
		String path2 = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(path1);
		System.out.println(path2);
	}

}
