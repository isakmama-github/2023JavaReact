package interfaceEx.kyr;

public class EletronicProductTest extends EletronicProduct {
	
	EletronicProductTest(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		EletronicProduct ep1 = new EletronicProduct("TV");
		ep1.turnOn();
		ep1.turnOff();
		ep1.repair();
		ep1.factoryReset();
		
		EletronicProduct ep2 = new EletronicProduct("컴퓨터");
		ep2.turnOn();
		ep2.turnOff();
		ep2.repair();
		ep2.factoryReset();
//		ep.repair();
		
//		Electronic.repair(); // 전체 접근이 아닌 개별 접근으로 저장영역 변경하고 위에서 각자 호출
		Electronic.factoryReset();
	}
}
