package exam01;

public class StringExample {

	public static void main(String[] args) {
		char var01 = 'A';
		char var02 = 65;
		char var03 = '\u0041';
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		
		String name = "\"홍길동\"";
		String job = "프로그래머";
//		String a01 = 'a';
		System.out.println(name);
		System.out.println(job);
		
		float var12 = 3.14f;	
		double var22 = 3.14;
		int var32 = 30;
		
		var32 = var01;
		System.out.println(var32);
		
		var12 = var01;
		System.out.println(var12);
		
		var22 = var01;
		System.out.println(var22);
		
		byte var42 = 65;
		System.out.println(var42);
		
//		var01 = var42;
		
		// casting
		var42 = (byte)var32;  // int -> byte 
		
		// int(4byte) -> char(2byte)
		var01 = (char)var32;
		
		// double -> int
		var22 = 3.945692;
		System.out.println(var22);
		var32 = (int)var22;
		System.out.println(var32);
	}

}
