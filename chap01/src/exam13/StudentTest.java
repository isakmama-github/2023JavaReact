package exam13;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "김자바"), 70);
		map.put(new Student(1, "홍길동"), 100);
		
		System.out.println(map.size());
		
		

	}

}
