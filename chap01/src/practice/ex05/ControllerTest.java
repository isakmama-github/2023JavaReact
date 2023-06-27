package practice.ex05;

public class ControllerTest {

	public static void main(String[] args) {
		Controller con = new TV(false);
		Controller con2 = new Radio(true);
		
		con.show();
		con2.show();

	}

}
