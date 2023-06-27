package exam04;

public class Person {
	
	String name;
	String ssn;
	String pn;
	
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public Person(String name, String ssn, String pn) {
		this.name = name;
		this.ssn = ssn;
		this.pn = pn;
	}
	
//	public void showInfo() {
//		
//		System.out.println("이름 : " + name);
//		System.out.println("주민번호 : " + ssn);
//		if (pn==null) {
//			System.out.println("여권을 가지고 있지 않습니다.");
//		} else {
//			System.out.println("여권번호 : " + pn);
//		}
//	}
	public String showInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + ssn);
		if (pn==null) {
			System.out.println("여권을 가지고 있지 않습니다.");
		} else {
			System.out.println("여권번호 : " + pn);
		}
		return name;
	}
	
}
