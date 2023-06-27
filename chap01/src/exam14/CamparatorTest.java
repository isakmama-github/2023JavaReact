package exam14;

import java.util.Arrays;
import java.util.Comparator;

public class CamparatorTest {

	public static void main(String[] args) {
		String[] strings = { "로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다." };

//		Arrays.sort(strings, new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.length()- s2.length();
//			}
//			
//		});
		
		Arrays.sort(strings, 
				(s1, s2) -> 
		           {return s1.length() - s2.length();});
		
		
		for (String s : strings) {
			System.out.println(s);
		}
	}

}
