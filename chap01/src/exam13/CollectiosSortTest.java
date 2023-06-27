package exam13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectiosSortTest {

	public static void main(String[] args) {
		String[] fruits = {"복숭아", "사과", "바나나", "망고", "키위", "바나나"};
		List<String> list = Arrays.asList(fruits);
		
		List<String> list3 = new ArrayList<String>(list);
		list3.add("복숭아");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println("sort : " + list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("reverse order : "+ list);
		Collections.reverse(list);
		System.out.println("reverse " + list);
		
		Collections.rotate(list, 3);
		System.out.println("rotate : "+ list);
		
		Collections.shuffle(list);
		System.out.println("shuffle : " + list);

		Collections.sort(list);
		int i = Collections.binarySearch(list, "사과");
		System.out.println(i);
		
		HashSet<String> set = new HashSet<String>(list);
		List<String> list2 = new ArrayList<String>(set);
		System.out.println(list2);
		
		
		for(String fruit : list2) {
			System.out.println(fruit + " : " 
		               + Collections.frequency(list, fruit));
		}
		
		
	}
}
