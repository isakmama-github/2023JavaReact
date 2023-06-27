package exam13;

public class EmptyBoxFactory {
	public static <T> Box<T> makeBox(){
		Box<T> box = new Box<T>();
		return box;
	}

}
