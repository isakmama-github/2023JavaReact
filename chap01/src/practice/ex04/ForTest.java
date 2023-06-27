package practice.ex04;

public class ForTest {

	public static void main(String[] args) {
		 
		 Person[] p = new Person[3];
		 p[0] = new Person("김자바", 22);
		 p[1] = new Student("이자바", 23, 100);
		 p[2] = new ForeignStudent("강자바", 25, 200, "대한민국");
		 
//		 Person p1 = new Person();
//		 p1.setName("김자바");
//		 p1.setAge(22);
//		 p.show();
//		 
//		 Student s = new Student();
//		 s.setName("이자바");
//		 s.setAge(23);
//		 s.setSsn(100);
//		 s.show();
//		 
//		 ForeignStudent f = new ForeignStudent();
//		 f.setName("강자바");
//		 f.setAge(25);
//		 f.setSsn(200);
//		 f.setNa("대한민국");
//		 f.show();
		 
		 
		 
		 for(Person p1 : p) {
			 p1.show();
		 }
		 
	}

}
