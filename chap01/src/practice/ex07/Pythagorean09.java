package practice.ex07;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Pythagorean09 {

	public static void main(String[] args) {
//		x 값을 1~100, 2~100, 3~100 ... 99~100 까지 대입
		IntStream.rangeClosed(1, 100)
			.boxed()
			.flatMap(x -> IntStream.rangeClosed(x, 100)
			.peek(i -> System.out.print("FlatMap(y값) = " + i + "\n"))
			.filter(y -> Math.sqrt(x * x + y * y) % 1 == 0)
			.mapToObj(y -> new int[] { x, y, (int) Math.sqrt(x * x + y * y) }))
			.limit(5).forEach(result -> System.out.println(Arrays.toString(result)));

//	        IntStream.rangeClosed(1, 100)
//	        		.boxed()
//	        		.flatMap(x -> IntStream.rangeClosed(x, 100)
//	        		.filter(y -> Math.sqrt(x * x + y * y) % 1 == 0)
//	        		.mapToObj(y -> new int[]{x, y, (int) Math.sqrt(x * x + y * y)}))
//	        		.forEach(result -> System.out.println(Arrays.toString(result)));

		/*
		 * [스트림의 형태변환 단계] 
		 * 1. IntStream 형태로 시작 
		 * 2. boxed() 메서드가 IntStream -> Stream<Integer> 타입으로 변환. 
		 * 3. flatMap 메서드에도 Stream<Integer> 형태를 유지 
		 * 4. mapToObj 메서드에서 <Stream<int[]> 로 변환.
		 */

	}
}
