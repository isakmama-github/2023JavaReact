package practice.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _06_Ex {

	public static void main(String[] args) {

		// 6개 수도 (서울, 워싱턴, 베이징, 파리, 마드리드, 런던)
		// 대응 인구수 (973.7, 63.2, 2115.0, 224.4, 326.5, 853.9)
		// 수도 이름과 인구수를 나타내는 Population 클래스 생성자 getter toString()
		// 2개 리스트 Stream<Population>을 생성
		// 인구 수가 300.0을 초과하는 나라와 인구 수를 출력
		
		List<String> list = new ArrayList<>();
		list.add("서울");
		list.add("워싱턴");
		list.add("베이징");
		list.add("파리");
		list.add("마드리드");
		list.add("런던");
		
		List<Double> num = new ArrayList<>();
		num.add(973.7);
		num.add(63.7);
		num.add(2115.0);
		num.add(224.4);
		num.add(326.5);
		num.add(853.9);
		
		List<Population> sum = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			String lists = list.get(i);
			Double nums = num.get(i);
			Population pl = new Population(lists, nums);
			sum.add(pl);
		}
		
		Stream<Population> stream = sum.stream()
				.filter(x -> x.getPopulation() > 300.0);
		
		stream.forEach(x -> System.out.println(x.toString()));
	}

}
