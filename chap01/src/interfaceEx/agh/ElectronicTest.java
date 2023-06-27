package interfaceEx.agh;

public class ElectronicTest {
	public static void main(String[] args) {
		
		Control c = new Control();
		Control cTV = new TV();
		Control cCom = new Computer();
		Control cNote = new Notebook();
		
		c.turnOn();
		c.repair();
		c.reset();
		c.turnOff();
		System.out.println();
		
		//tv
		cTV.repair();
		cTV.turnOn();
		System.out.println();
		
		//computer
		cCom.repair();
		cCom.reset();
		System.out.println();
		
		//notebook
		cNote.repair();
		cNote.turnOff();
		

	}
}
