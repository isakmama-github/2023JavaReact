package practice.ex07.ex04;

import java.util.stream.Collectors;

import exam15.Nation;
import exam15.Type;

//Nation.nations 리스트에서 육지에 있는 나라 이름을 
//콤마와 공백(", ")으로 연결하여 출력하는 프로그램을 작성하시오.

public class NationTest {
        public static void main(String[] args) {
        	System.out.println(Nation.nations.stream()
        			.filter(s ->s.getType() == Type.LAND)
        			.collect(Collectors
        					.mapping(Nation::getName, 
        							Collectors.joining(", "))));
    }
}
