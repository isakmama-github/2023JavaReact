package practice.ex07;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import exam15.Nation;
import exam15.Type;

public class GDPTest {
	public static void main(String[] args) {
		Stream<Nation> sn = Nation.nations.stream();
		
		Map<Type, Map<Object, List<Nation>>> map = 
				sn.collect(Collectors
						.groupingBy(Nation::getType, 
								Collectors
								.groupingBy(n -> n
										.getGdpRank()<12?"선진국":"개도국")));
		System.out.println(map);
	}
}
