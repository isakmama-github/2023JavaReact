package exam13;

import java.util.Objects;

public class Student {
	
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sno);
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.name.equals(other.name) && sno == other.sno;
	}
	
	

}
