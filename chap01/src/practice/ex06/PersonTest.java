package practice.ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonTest {
	public static void main(String[] args) {
		Set<Person> person = new HashSet<>();
		person.add(new Person("김자바",20));
		person.add(new Person("이자바",30));
		person.add(new Person("서자바",40));
		
		System.out.println(person);
		
		Iterator<Person> iteratorPerson = person.iterator();
		// hasNext : 그 다음에 존재할 때 true /없을 땐 false 
		while(iteratorPerson.hasNext()) {
			System.out.println(iteratorPerson.next()); 
		}
		//person 참조변수를 가지고 와서 뽑아 사용함. 
		//print 라는 메서드에서 toString을 뽑아오는데 오버라이딩해서 리턴값을 가지고 옴!
		
	}

}
