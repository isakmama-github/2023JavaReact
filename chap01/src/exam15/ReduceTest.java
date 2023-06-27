package exam15;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class ReduceTest {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(5, 6, 3, 4 ,7);
		
		int sum1 = numbers.stream().reduce(0, (a, b)-> a+b);
		int sum2 = numbers.stream().reduce(0, Integer::sum);
		int sum3 = numbers.stream().reduce(1, (a, b) -> a*b);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
		Optional<Integer> sum4 = numbers.stream()
				                        .reduce(Integer::sum);
		System.out.println(sum4.get());
		
		OptionalInt sum5 = numbers.stream()
				.mapToInt(x -> x.intValue()).reduce(Integer::sum);
		System.out.println(sum5.getAsInt());
		
		Optional<Integer> sum6 = 
				numbers.stream().reduce((a,b) -> a*b );
		sum6.ifPresent(Util::print);
	}

}
