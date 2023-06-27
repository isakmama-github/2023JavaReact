package exam01;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("매개변수의 숫자가 부족함.");
			System.exit(0);
		}
		
		String str1 = args[0];
		String str2 = args[1];
		
		System.out.println(str1 + ", " + str2);
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + "+"+num2+"="+(num1+num2));
		
		
	}

}
