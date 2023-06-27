package practice.ex99;

import java.util.stream.IntStream;

public class RangeTest {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .mapToObj(i -> "A" + i)
                .forEach(s -> System.out.print(s + " "));
    }
}
