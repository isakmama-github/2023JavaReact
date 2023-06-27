package exam15;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterTest {

	public static void main(String[] args) {
		System.out.print("문자열 스트림 : ");
		Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
		Stream<String> s2 = s1.filter(s -> s.startsWith("c"));
		Stream<String> s3 = s2.skip(1);
		s3.forEach(Util::print);
		
		System.out.println();
		Stream.of("a1", "b1", "b2", "c1", "c2", "c3")
			    .filter(s -> s.startsWith("c"))
				.skip(1)
				.forEach(Util::print);
		
		System.out.print("\n정수 스트림 : ");
		IntStream i1 = IntStream.of(1, 5, 1, 2, 2, 3, 6, 7);
		IntStream i2 = i1.filter(i -> i%2==0);
		IntStream i3 = i2.distinct();
		i3.forEach(Util::print);
		
		System.out.println();
		IntStream.of(1, 5, 1, 2, 2, 3, 6, 7)
		         .filter(i -> i%2==0)
		         .distinct()
		         .forEach(Util::print);
		
		System.out.print("\n인구가 1억(100백만) 이상의 2개 나라 : ");
		Stream<Nation> n1 = Nation.nations.stream();
		Stream<Nation> n2 = n1.filter(p -> p.getPopulation() > 100.0);
		Stream<Nation> n3 = n2.limit(2);
		n3.forEach(Util::printWithParethesis);
		System.out.println();
		
		Nation.nations.stream()
						.filter(p -> p.getPopulation() > 100.0)
						.limit(2)
						.forEach(Util::printWithParethesis);
	}

}
