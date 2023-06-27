package exam15;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingTest {

	public static void main(String[] args) {
		Stream<Nation> s1 = Nation.nations.stream().limit(4);
		Map<Type, List<Nation>> m1 = 
				s1.collect(Collectors.groupingBy(Nation::getType));
		System.out.println(m1);
		
		s1 = Nation.nations.stream().limit(4);
		Map<Type, Long> m2 = s1
				.collect(Collectors.groupingBy(Nation::getType,
						Collectors.counting()));
		System.out.println(m2);
		
		s1 = Nation.nations.stream().limit(4);
		Map<Type, String> m3 = s1
				.collect(Collectors.groupingBy(
						Nation::getType,
//						Nation::getName));
						Collectors.mapping(Nation::getName,
						Collectors.joining("+"))));
        System.out.println(m3);
	}

}
