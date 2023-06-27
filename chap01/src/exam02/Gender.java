package exam02;

public enum Gender {
	
	MALE("남성"), FEMALE("여성");
	
	private String s;
	
	Gender(String s){
		this.s = s;
	}

	public String toString() {
		return s;
	}
}
