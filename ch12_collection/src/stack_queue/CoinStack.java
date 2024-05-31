package stack_queue;

import java.util.Stack;

public class CoinStack {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		//동전 꺼내기
		Coin coin = coinBox.pop();
		System.out.println(coin.getValue());
		System.out.println(coinBox.size());
		//동전 확인하기
		System.out.println(coinBox.peek().getValue());
		
		System.out.println("------------------------");
		while(!coinBox.isEmpty()) {
			coin=coinBox.pop();
			System.out.println(coin.getValue());
		}


	}

}
