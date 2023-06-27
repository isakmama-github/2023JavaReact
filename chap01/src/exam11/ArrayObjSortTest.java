package exam11;

import java.util.Arrays;

public class ArrayObjSortTest {

	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("ki", 20);
		ar[1] = new Person("Lee", 21);
		ar[2] = new Person("Park", 50);
		
		Arrays.sort(ar);
		
		for(Person p : ar) {
			System.out.println(p);
		}
		
		int idx = Arrays.binarySearch(ar, new Person("Lee", 21));
		System.out.println(ar[idx]);
		

	}

}
