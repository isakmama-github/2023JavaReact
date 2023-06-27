package practice.ex04;

public class Smartphone extends Telephone {

	private String game;

	public Smartphone() {}

	public Smartphone(String owner, String game) {
		super();
		this.owner =owner;
		this.game = game;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}
	
	
	public void playGame() {
		System.out.println(super.owner+"가 "+game+" 하는 중입니다.");
	}
	
	
}
