package practice.ex03;

public class Member {
	// 회원관리를 위한 회원 모델링 클래스
	// 이름, 아이디, 암호, 나이
	// 1) 외부 객체는 이와 같은 회원 정보에 직접 접근할 수 없고 접근자와 설정자로만 접근할 수 있다
	// 2) 모든 회원 정보를 사용해 객체를 생성할 수 있는 생성자
	
	private String name;
	private String id;
	private String pwd;
	private int age;
	
	Member() {}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	Member(String name, String id, String pwd, int age) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.age = age;
	}
	
	public void setInfo(String name, String id, String pwd, int age) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.age = age;
	}
	
	public Member getInfo() {
		Member m = new Member();
		m.name = this.name;
		m.id = this.id;
		m.pwd = this.pwd;
		m.age = this.age;
		return m;
	}
	
//	public static void main(String[] args) {
//		Member m1 = new Member("김강자", "test01", "pwok1", 17);
//		Member m2 = new Member("홍길동", "test03", "121212", 20);
//		
//		System.out.println(m1.name + ":" 
//				+ m1.id + "/" + m1.pwd + ":" + m1.age);
//		
//		m1.setInfo(null, "test02", "pwpwpwpwpw", 0);
//		System.out.println(m1.name + ":" 
//				+ m1.id + "/" + m1.pwd + ":" + m1.age);
//		
//		m2 = m2.getInfo();
//		System.out.println(m2.name + ":" 
//				+ m2.id + "/" + m2.pwd + ":" + m2.age);
//		
//		
//	}
}
