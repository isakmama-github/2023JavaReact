package interfaceEx.ksm;

public class EleTest {

	public static void main(String[] args) {
		Test t = new Test();
		
		Tv tv = new Tv();
		Com c = new Com();
		
		
		t.test(tv);
		t.test(c);
		c.clear();
		
	}

}
