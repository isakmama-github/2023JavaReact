package interfaceEx.pkw.implement;

public class Computer extends Electronic {
	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터 수리");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터 끔");
	}
}
