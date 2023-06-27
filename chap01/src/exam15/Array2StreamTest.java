package exam15;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array2StreamTest {

	public static void main(String[] args) {
		int[] ia = {2, 3, 5, 7, 11, 13};
		IntStream is = Arrays.stream(ia);
		is.forEach(Util::print);
		System.out.println();
		
		is = Arrays.stream(ia);
		is.forEach(Util::print);
		System.out.println();
		
		
		String[] strings =
			{"The", "pen", "is", "mighter", "than", "the", "sword"};
		Stream<String> ss = Stream.of(strings);
		ss.forEach(Util::print);
		System.out.println();
		
		double[] da = {1.2, 3.14, 5.01, 9,6};
		DoubleStream ds = DoubleStream.of(da);
		ds.forEach(Util::print);
		

	}

}
