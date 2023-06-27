package exam13;

public class BoxTest {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<>();
		Box<Orange> oBox = new Box<>();
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Apple apple = aBox.getObj();
		Orange orange = oBox.getObj();
		
		System.out.println(apple);
		System.out.println(orange);
		
//		aBox.setObj("apple");
//		oBox.setObj("orange");
//		
//		apple = (Apple) aBox.getObj();
//		orange = (Orange) oBox.getObj();
//		
//		System.out.println(apple);
//		System.out.println(orange);

	}

}
