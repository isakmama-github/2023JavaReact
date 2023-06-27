package practice.ex99;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PythagorasTest {
    public static void main(String[] args) {
        Stream<int[]> triples = IntStream.range(1, 100).boxed()
                .flatMap(x ->
                        IntStream.range(x, 100)
                        .filter(y -> Math.sqrt(x * x + y * y) % 1 == 0)
                        .mapToObj(y ->
                                new int[]{x, y, (int)Math.sqrt(x * x + y * y)})
                        
                );
        triples.limit(5)
                .forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + ", " + t[2] + ")"));
    }
}
