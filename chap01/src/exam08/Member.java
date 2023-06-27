package exam08;

public class Member {

	private String secret = "비공개";
	String s = "외부";
	
	class Inner{
		String s = "내부";
		
		public void show1() {
			System.out.println("내부클래스");
			System.out.println(secret);
			System.out.println(s);
			System.out.println(Member.this.s);
		}
	}
	
	public static void main(String[] args) {
		Member m = new Member();
		Member.Inner m1 = m.new Inner(); 
		
		System.out.println(m1.s);
		m1.show1();
	}
			
}
