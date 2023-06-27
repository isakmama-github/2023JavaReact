package interfaceEx.agh;

public class Notebook extends Control{

	@Override
	public void repair() {
		System.out.println("노트북에 수리가 필요합니다.");
	}
		@Override
		public void turnOff() {
			System.out.println("노트북을 전원을 끕니다.");
		}
	
	
}
