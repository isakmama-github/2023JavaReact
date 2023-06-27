package exam13;

public class BoxHandler {
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.getObj();
		System.out.println(t);
//		box.setObj(t);
	}
    public static void inBox(Box<? super Toy> box, Toy n) {
    	box.setObj(n);
//    	Toy t = box.getObj();
    }
}
