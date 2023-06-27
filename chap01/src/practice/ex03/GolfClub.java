package practice.ex03;

public class GolfClub {
	
	private static String a;
	private static int num;
	
	public GolfClub(int num, String a) {
		this.a=a;
		this.num=num;
	
	}
	
	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		GolfClub.num = num;
	}

	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	

	
	void print(int num) {
		System.out.println(this.num+"번 아이언입니다.");
	}
	
	void print(String a) {
		System.out.println(this.a+"입니다");
	
	}
	

}
