package practice.ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

//두 배열을 Collections의 addAll() 메서드를 이용해 HashSet 객체로 생성
//2개의 HashSet 객체를 출력
//2개의 HashSet 객체가 동일한지 비교한 값을 출력
//s1에 의한 HashSet이 s2에 의한 HashSet 원소를 모두 포함하는지 출력
//2개의 HashSet 합집합과 교집합을 구해서 출력
public class HashSetTest {

	public static void main(String[] args) {
		String[] s1 = {"a","b","a","b","c"};
		String[] s2 = {"c"};
		
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		
		Collections.addAll(l1, s1);
		Collections.addAll(l2, s2);
		
		HashSet<String> set1 = new HashSet<>(l1);
		HashSet<String> set2 = new HashSet<>(l2);
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println("객체 동일 : " + set1.equals(set2));
		System.out.println("s1이 s2에 포함 : "+ set1.containsAll(set2));		

		HashSet<String> setAdd = new HashSet<>(l1);
		HashSet<String> setRetain= new HashSet<>(l1);
		setAdd.addAll(set2);
		System.out.println("set1과 set2의 합집합 : " + setAdd);
		setRetain.retainAll(set2);
		System.out.println("set1과 set2의 교집합 : " + setRetain);
		

	}

}
