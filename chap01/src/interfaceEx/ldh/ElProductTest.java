package interfaceEx.ldh;

public class ElProductTest {

	public static void main(String[] args) {
		Electronicproducts tv2 = new Television2();
		Electronicproducts com = new Computer();
		Electronicproducts nb = new NoteBook();
		System.out.println("-------티비---------");
		tv2.turnOn();
		tv2.repair();
		tv2.reSet();
		tv2.turnOff();
		
		System.out.println("-------컴퓨터---------");
		com.turnOn();
		com.repair();
		com.reSet();
		com.turnOff();
		
		System.out.println("-------노트북---------");
		nb.turnOn();
		nb.repair();
		nb.reSet();
		nb.turnOff();
	}

}
