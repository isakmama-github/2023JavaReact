package exam14;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		IntPredicate even = x -> x % 2 == 0;
		System.out.println(even.test(368)? "짝수": "홀수" );
		
		IntPredicate one = x -> x==1;
		IntPredicate oneOrEven = one.or(even);
		System.out.println(oneOrEven.test(1)? "1 혹은 짝수": "1이아닌 홀수");

		Predicate<String> p = Predicate.isEqual("Java Lambda");
		System.out.println(p.test("Java Lambda"));
		System.out.println(p.test("JavaFX"));
		
		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
		System.out.println(bp.test(20, 3));
	}

}
