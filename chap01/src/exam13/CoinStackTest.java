package exam13;

import java.util.Stack;

public class CoinStackTest {

	public static void main(String[] args) {
		Stack<Coin> coinbox = new Stack();
		
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(10));
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println(coin.getValue()+ "원");
		}

	}

}
