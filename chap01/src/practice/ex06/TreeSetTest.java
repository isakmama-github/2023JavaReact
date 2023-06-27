package practice.ex06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> a1 = new HashSet<>();
        a1.addAll(Arrays.asList("독수리","나비","염소","고양이","개미","여우"));
        System.out.println("hashset" + a1);
        
        TreeSet<String> a2 = new TreeSet<>(a1);
        System.out.println("treeset" + a2);
        System.out.println("first: " + a2.first());
        System.out.println("last: " + a2.last());
        
        //lower : TreeSet 에서 특정원소 이전 값 출력
        System.out.println("lower: " + a2.lower("독수리"));
        System.out.println("higher: " + a2.higher("독수리"));
	}

}
