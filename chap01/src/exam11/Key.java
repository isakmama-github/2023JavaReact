package exam11;

public class Key {
	public int number;
	
	Key(int number){
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key comapreKey = (Key)obj;
			if (this.number == comapreKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return number;
	}

	@Override
	public String toString() {
		return "Key [number=" + number + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Key의 number는 " + number;
//	}
	

}
