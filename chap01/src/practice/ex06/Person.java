package practice.ex06;

public class Person {
	// 필드
	String name;
	int age;

	// 생성자
	Person() {
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메서드
	@Override
	public String toString() {
		return this.name + "는 " + this.age + "세 입니다.";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			return Person.this.name.equals(name)&&(Person.this.age==age);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}

	
}
