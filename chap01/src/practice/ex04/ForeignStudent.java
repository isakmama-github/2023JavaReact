package practice.ex04;

public class ForeignStudent extends Student {
	String na;
	
	public ForeignStudent(String name, int age, int ssn, String na) {
		super(name, age, ssn);
		this.na = na;
	}
	
	public String getNa() {
		return na;
	}
	
	public void setNa(String na) {
		this.na = na;
	}
	
	public void show() {
		System.out.println("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + ssn + ", 국적 : " + na +"]");
	}
	
}
