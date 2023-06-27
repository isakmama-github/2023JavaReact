package exam07;

public class ImpleTest {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.mathodA();
		System.out.println();

		InterfaceB ib = impl;
		ib.mathodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.mathodA();
		ic.mathodB();
		ic.mathodC();
	}

}
