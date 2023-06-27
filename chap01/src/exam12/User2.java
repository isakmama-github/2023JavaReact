package exam12;

public class User2 extends Thread{
	
	private Calculator calc;
	
	public void setCalculator(Calculator calc) {
		this.calc = calc;
		this.setName("User2");
	}
	
	@Override
	public void run() {
		calc.setMemory(100);
	}

}
