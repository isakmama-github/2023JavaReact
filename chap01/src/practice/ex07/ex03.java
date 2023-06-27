package practice.ex07;

import java.util.stream.IntStream;

//03. rangeClosed()와 매핑연산을 사용하여 다음과 같은 실행결과가 출력되는 프로그램을 작성하라.
//== 실행결과 : A1 A2 A3 A4 A5 A6 A7 A8 A9 A10

public class ex03 {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10)
		    .mapToObj(x -> "A" + x + " ")
		    .forEach(x -> System.out.print(x));
	}

}
