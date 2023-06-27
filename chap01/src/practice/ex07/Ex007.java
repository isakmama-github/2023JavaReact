package practice.ex07;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//07. 문자열 리스트("민국","지우","하준","지우")가 있다.
//다음 실행 결과와 같이 문자열 빈도수로 구성된 Map타입으로 수집한 후 출력하는 프로그램을 작성하시오.
//== 출력결과 : {하준=2, 민국=1, 지우=3}

public class Ex007 {
	public static void main(String[] args) {
		
	List<String> children1 = List
			.of("지우", "민국", "하준", "지우", "하준", "지우"); // 리스트내에 애들이름 갯수별로 입력
	Map<String, Long> children2 = children1.stream()
			.collect(Collectors
					.groupingBy(c ->c, Collectors.counting()));
	//integer왜 에러뜨는지 의문,,,,  
//	스트림을 이용해서 콜렉터스에서 그룹해둔것에서 카운팅하기
	System.out.println(children2);
	}
}


