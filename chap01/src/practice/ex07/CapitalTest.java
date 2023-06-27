package practice.ex07;

import java.util.Arrays;
import java.util.List;

public class CapitalTest {
	public static void main(String[] args) {
		List<String> capital = 
				Arrays.asList("서울","워싱턴","베이징","파리","마드리드","런던");
		
		System.out.println(capital.stream().sorted().findFirst());
			


		
		
		
		
	}
}
