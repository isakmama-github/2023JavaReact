package exam11;

public class StringIndexOfTest {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍프";
		            //01234567890
		String ssn = "78121215678";
		
		int location = subject.indexOf("프",4);
		System.out.println(location);
		
		if(subject.indexOf("자바") == -1) {
			System.out.println("자바와 관련이 없는 책이군요.");
			
		} else {
			System.out.println("자바와 관련된 책이군요.");
		}
		
		int length = ssn.length();
		if (length == 13) {
			System.out.println("주민번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민번호 자릿수가 틀립니다.");
		}
		
		String newSubject = subject.replace("자바", "Java");
		System.out.println(newSubject);
		
		System.out.println(ssn.substring(0, 6));
		System.out.println(ssn.substring(7));

	}

}
