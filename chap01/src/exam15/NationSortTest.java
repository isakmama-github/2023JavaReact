package exam15;

import java.util.Comparator;
import java.util.stream.Stream;

public class NationSortTest {

	public static void main(String[] args) {
		Stream<Nation> n1 = Nation.nations.stream();
		Stream<Nation> n2 = 
				n1.sorted(Comparator.comparing(Nation::getName));
		Stream<String> s3 = n2.map(x -> x.getName());
		s3.forEach(Util::printWithParethesis);
		
		
		System.out.println("\n국가 GDP순서 : ");
		Stream<Nation> n3 = Nation.nations.stream();
		Stream<Nation> n4 =
				n3.sorted(Comparator.comparing(Nation::getGdpRank));
		Stream<String> s4 = n4.map(Nation::getName);
		s4.forEach(Util::printWithParethesis);
		System.out.println();
		
		Stream<String> s1 = Stream.of("d2", "a3", "j4", "r2");
		Stream<String> s2 = s1.sorted();
		s2.forEach(Util::print);

	}

}
