package interfaceEx.agh;

public class Computer extends Control{

	@Override
	public void repair() {
		System.out.println("컴퓨터에 수리가 필요합니다.");
	}
		
	@Override
	public void reset() {
		System.out.println("컴퓨터를 초기화합니다.");
	}
	
}
