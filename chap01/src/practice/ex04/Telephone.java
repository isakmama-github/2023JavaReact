package practice.ex04;

public class Telephone extends Phone {
	private String when;
	public Telephone() {}
	public Telephone(String owner ,String when) {
		super();
		this.owner=owner;
		this.when = when;
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	} 
	
	public void autoAnswering() {
		System.out.println(super.owner+"가 부재중이니 "+when+" 전화 요망");
	}
	
	
	
}
