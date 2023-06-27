package practice.ex05;

public class Radio extends Controller{

	Radio(boolean power){
		this.power = power;
	}
	
	@Override
	String getName() {
		return "Radio";
	}

	
	
}
