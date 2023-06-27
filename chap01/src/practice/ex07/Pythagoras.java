package practice.ex07;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import exam15.Util;

public class Pythagoras {

	public static void main(String[] args) {

//		exam15 -> ReduceTest 참고
//
//		List<Integer> nums = List.of(5, 6, 3, 4, 7);
//
//		Optional<Integer> sum4 = nums.stream().reduce(Integer::sum);
//		OptionalInt sum5 = nums.stream().mapToInt(x -> x.intValue()).reduce(Integer::sum);
//		
//		System.out.println(sum4.get());
//		System.out.println(sum5.getAsInt());
		
		
//		exam15 -> FlatMapTest 참고
//		
//		List<String> list1 = List.of("안녕, 자바!", "잘 가, C++");
//
//		Stream<String> s1 = list1.stream();
//		Stream<String> s2 = s1.flatMap(s->Arrays.stream(s.split(" ")));
//		s2.forEach(Util::printWithParethesis);
//		System.out.println();
//		
//		list1.stream().map(s->Arrays.stream(s.split(" "))).forEach(p->p.forEach(Util::printWithParethesis));
//		System.out.println("<-- 플랫맵대신 맵으로 구현함");


//		IntStream.range(2, 100).flatMap(x->IntStream.range(x, 100).map(y->new int[] {x, y}));
		
//		IntStream.range(2, 100).mapToObj(t->Integer.valueOf(t))
//		.flatMap(x->IntStream.range(x, 100).mapToObj(t->Integer.valueOf(t)).map(y->new int[] {x, y}))
//		.forEach(p->System.out.println(p[0] + "," + p[1]));
//		
		
		
//		Math.sqrt 미사용
//		IntStream.range(2, 100).mapToObj(t -> Integer.valueOf(t))
//		.flatMap(x -> IntStream.range(x, 100).mapToObj(t -> Integer.valueOf(t)).flatMap(y -> IntStream.range(y, 100).mapToObj(t -> Integer.valueOf(t)).map(z -> new int[] { x, y, z })))
//		.filter(f -> f[0] * f[0] + f[1] * f[1] == f[2] * f[2]).limit(5)
//		.forEach(x -> System.out.print("(" + x[0] + ", " + x[1] + ", " + x[2] + ")"));
//
//		System.out.println();

//		Math.sqrt 사용
		IntStream.range(2, 100).boxed()
		.flatMap(x -> IntStream.range(x, 100).boxed().map(y -> new int[] { x, y }))
		.filter(f -> Math.sqrt(f[0] * f[0] + f[1] * f[1]) % 1 == 0).limit(5)
		.forEach(s -> System.out.print("(" + s[0] + ", " + s[1] + ", " + (int) Math.sqrt(s[0] * s[0] + s[1] * s[1]) + ")"));

	}
}
