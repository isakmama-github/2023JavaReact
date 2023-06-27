package exam15;

import java.util.stream.IntStream;

public class ParallelTest {

	public static void main(String[] args) {
		long start;
		long end;
		long total;
		
		IntStream sequantial = IntStream.rangeClosed(1,1000000000);
		start = System.currentTimeMillis();
		total = sequantial.sum();
		end = System.currentTimeMillis();
		System.out.println("순차처리 : " + (end - start));
		
		IntStream parallel = IntStream.rangeClosed(1,1000000000).parallel();
		start = System.currentTimeMillis();
		total = parallel.sum();
		end = System.currentTimeMillis();
		System.out.println("병렬처리 : " + (end - start));
	}

}
