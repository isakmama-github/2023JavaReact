package exam11;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+name + ": "+ age+"]";
	}

	@Override
	public int compareTo(Person o) {
//		if(this.age > o.age) {
//			return 1;
//		} else if (this.age < o.age) {
//			return -1;
//		} else {
//			return 0;
//		}
//		if(this.name.length() > o.name.length()) {
//			return 1;
//		} else if(this.name.length() < o.name.length()) {
//			return -1;
//		} else {
//			return 0;
//		}
		
//		if (this.name.compareTo(o.name) > 0) {
//			return 1;
//		} else if(this.name.compareTo(o.name) < 0) {
//			return -1;
//		} else {
//			return 0;
//		}
//		return this.age - o.age;
//		return o.age - this.age;
		return this.name.compareTo(o.name);
	}

}
