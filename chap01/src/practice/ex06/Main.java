package practice.ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String[] s = { "독수리", "고양이", "강아지" };
		String[] s2 = { "개미", "개미" };

		// list라는 변수명의 ArrayList를 생성하고, 배열 s를 복사한다.
		List<String> list = new ArrayList<>();
		Collections.addAll(list, s);
		System.out.println(list);

		// s2를 복사
		List<String> all = new ArrayList<>(list);
		Collections.addAll(all, s2);
		System.out.println("nCopies(nCopies) : " + all);

		//all을 "벌"로 채우기
		Collections.fill(all, "벌");
        System.out.println("'벌'을 채운 후(fill) : " + all);
        
        // all에 list를 추가하기
        String[] listArray = list.toArray(new String[0]);
        Collections.addAll(all, listArray);
        System.out.println("리스트를 모두 추가한 후(addAll) : " + all);
        
        // 리스트 섞기
        Collections.shuffle(all);
        System.out.println("리스트를 섞은 후(shuffle) : " + all);
        
        // 역순 정렬
        Collections.reverse(all);
        System.out.println("리스트를 역순으로 정렬한 후(reverse) : " + all);

        // 최소값, 최대값, 빈도 출력
        System.out.println("리스트에서 최소(min) : " + Collections.min(all));
        System.out.println("리스트에서 최대(max) : " + Collections.max(all));
        System.out.println("리스트에서 '벌'의 빈도(frequency) : " + Collections.frequency(all, "벌"));
	}
}
