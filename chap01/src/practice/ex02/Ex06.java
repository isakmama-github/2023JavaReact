package practice.ex02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String young ;
		String cheol;	
		String result;
		
		do {
			System.out.println("**가위(s), 바위(r), 보(p)** \n영희가 낼 s,r,p중 하나를 입력해주세요.");
			young =sc.next();
		if(young.equals("s") || young.equals("r")|| young.equals("p")) {
			System.out.println("**가위(s), 바위(r), 보(p)** \n철수가 낼 s,r,p중 하나를 입력해주세요.");
			cheol =sc.next();
			
			if(cheol.equals("s") || cheol.equals("r")|| cheol.equals("p")) {
				break;
				
			}else {
				while(!(cheol.equals("s") || cheol.equals("r")|| cheol.equals("p"))) {
					System.out.println("**가위(s), 바위(r), 보(p)** \n철수가 낼 s,r,p중 하나를 입력해주세요.");
					cheol =sc.next();
				}
				break;
			}
		}
		
		}while(true);
		
		
		
		result=game(young , cheol);
		System.out.println(result);
		
	}
	
	public static String game(String young, String cheol) {
        if (young.equals(cheol)) {
            return "무승부";
        } else if ((young.equals("r") && cheol.equals("s"))
        		|| (young.equals("p") && cheol.equals("r"))
        		|| (young.equals("s") && cheol.equals("p"))) {
            return "철수가, 승!";
        } else {
            return "영희가, 승!";
        }
    }
	
	

}
