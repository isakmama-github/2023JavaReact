package practice.ex03;

public class MemberTest {
	public static void main(String[] args) {
		Member m1 = new Member("김강자", "test01", "pwok1", 17);
		Member m2 = new Member("홍길동", "test03", "121212", 20);
		
		Member m = m1.getInfo();
		m.setName("김강자");
		
		System.out.println(m.getName());
		
//		System.out.println(m.getName() + ":" 
//				+ m.id + "/" + m.pwd + ":" + m.age);
//		
//		m1.setInfo(null, "test02", "pwpwpwpwpw", 0);
//		System.out.println(m1.getName() + ":" 
//				+ m1.id + "/" + m1.pwd + ":" + m1.age);
//		
//		m2 = m2.getInfo();
//		System.out.println(m2.getName() + ":" 
//				+ m2.id + "/" + m2.pwd + ":" + m2.age);
		
		
	}
}
