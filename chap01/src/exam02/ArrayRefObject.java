package exam02;

public class ArrayRefObject {

	public static void main(String[] args) {
		String[] strArr = new String[3];
		strArr[0] = "Good";
		strArr[1] = "Good";
		strArr[2] = new String("Job");
		
		System.out.println(strArr[1]==strArr[0]);
		System.out.println(strArr[2]==strArr[0]);
		System.out.println(strArr[1]==strArr[2]);
		System.out.println(strArr[0].equals(strArr[1]));
		System.out.println(strArr[0].equals(strArr[2]));

	}

}
