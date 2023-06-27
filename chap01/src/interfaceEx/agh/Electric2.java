package interfaceEx.agh;

public interface Electric2 {
	
	default void repair() {
		System.out.println("제품을 수리해야합니다");
	}
	public void reset();

}
