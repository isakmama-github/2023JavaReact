package interfaceEx.kgs;

public class RepairReset implements Controlable2 {

	@Override
	public void repair() {
		System.out.println("장비를 수리한다.");
	}

	@Override
	public void factoryReset() {
		System.out.println("장비를 초기화한다.");
	}
}
