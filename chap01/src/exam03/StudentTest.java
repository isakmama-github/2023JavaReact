package exam03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1변수가 Student객체를 참조합니다.");
		System.out.println(s1);
		
		Student s2 = new Student();
		System.out.println("s2변수가 Student객체를 참조합니다.");
		System.out.println(s2);
		
		Ball b1 = new Ball();
		System.out.println(b1.getVolumn());   

	}

}
