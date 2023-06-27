package practice.ex04;

public class Student extends Person {
	int ssn;
	
	public Student(String name, int age, int ssn) {
		super(name, age);
		this.ssn = ssn;
	}
	
	public int getSsn() {
		return ssn;
	}
	
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void show() {
		System.out.println("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + ssn +"]");
	}
}
