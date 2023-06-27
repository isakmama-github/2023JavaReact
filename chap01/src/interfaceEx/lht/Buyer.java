package interfaceEx.lht;

public class Buyer {
	
	int money = 1000;
	
	Buyer(){}
	
	public void buy(eProduct p) {
		if(money < p.price) {
			System.out.println("-------------------------------");
			System.out.println("가진 돈이 부족해 "+p.toString()+"을(를) 살 수 없습니다.");
			System.out.println("-------------------------------");
		}
		else {
			money -= p.price;
			System.out.println("-------------------------------");
			System.out.println(p.toString() + "을 구매하였습니다.");
			System.out.println("남은 잔액은 " + money + "만원 입니다.");
			System.out.println("-------------------------------");
		}
			
	}
}
