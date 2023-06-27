package exam15;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect2Test {
	public static void main(String[] args) {
		Stream<Nation> s1 = Nation.nations.stream();
		Stream<String> ss = s1.map(Nation::getName)
				.limit(3);
		List<String> list = ss.collect(Collectors.toList());	
		System.out.println(list);
		
		s1 = Nation.nations.stream();
		Set<String> set = s1.map(Nation::getName)
				.limit(3)
				.collect(Collectors.toSet());
		System.out.println(set);
		
		s1 = Nation.nations.stream();
		Map<String, Double> map = s1
				.filter(Nation::isIsland)
				.collect(Collectors.toMap(Nation::getName, 
						Nation::getPopulation));
		System.out.println(map);
		
		s1 = Nation.nations.stream();
		Set<Nation> hashSet = s1
				.filter(Predicate.not(Nation::isIsland))
				.collect(Collectors.toCollection(HashSet<Nation>::new));
		
		System.out.println(hashSet);
		
		hashSet.forEach(x->
		    Util.print("("+ x.getName() + ", " + x.getGdpRank()+")"));
	}
	
}
