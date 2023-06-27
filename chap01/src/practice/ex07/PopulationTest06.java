//2) 2개의 리스트로 Stream<Population>을 생성한다.
//3) 다음 실행 결과와 같이 인구 수가 300.0을 초과하는 나라와 인구 수를 출력한다.
//== 실행결과 : 서울(973.7)
//              베이징(2115.0)
//              마드리드(326.5)
//              런던(853.9)

package practice.ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PopulationTest06 {

	public static void main(String[] args) {
		
		List<String> city = List.of("서울", "워싱턴", "베이징", "파리", "마드리드","런던");
		List<Double> cityPopulation = List.of(973.7, 63.2, 2115.0, 224.4, 326.5, 853.9);	
		List<Population06>  populationList = new ArrayList<>();
		
		//for문으로 두 리스트의 데이터를 매핑하는 방법
		for(int i = 0; i < city.size(); i++) {
			Population06 population = new Population06();
			population.setFields(city.get(i), cityPopulation.get(i));
			populationList.add(population);
		}
		
		
		Stream<Population06> populationStream = populationList.stream();
		populationStream.filter(i->i.getPopulation() > 300).forEach(System.out::println);
		
		System.out.println("=================================");
		
		//스트림을 사용해서 두 리스트의 데이터를 매핑하는 방법1
		populationList.stream()
		   .map(i -> new Population06(i.getName(), i.getPopulation()))
		   .filter(i ->i.getPopulation() > 300)
		   .collect(Collectors.toList()).stream()
		   .forEach(System.out::print);
		
		//스트림을 사용해서 두 리스트의 데이터를 매핑하는 방법2(길이 예외처리)
		System.out.println(cityPopulation.get(0));
		List<Population06> populationList2 = IntStream
				.range(0, Math.min(city.size(), cityPopulation.size()))
				.mapToObj(i -> new Population06(city.get(i), cityPopulation.get(i))).
				filter(i ->i.getPopulation() > 300).
				collect(Collectors.toList());
		populationList2.stream().forEach(System.out::println);
		
	}
}
