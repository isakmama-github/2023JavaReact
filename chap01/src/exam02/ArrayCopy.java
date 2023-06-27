package exam02;

public class ArrayCopy {

	public static void main(String[] args) {
		String[] oldArray = {"java", "array", "copy"};
		String[] newArray = new String[5];
		
		System.arraycopy(oldArray, 1, newArray, 1, 2);
		
		for(int i=0; i<newArray.length; i++) {
			System.out.print(newArray[i] + ", ");
		}

	}

}
