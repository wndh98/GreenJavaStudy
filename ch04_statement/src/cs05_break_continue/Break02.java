package cs05_break_continue;

public class Break02 {

	public static void main(String[] args) {
		// 주사위 굴려서 6 - 5가 연달아 나오면 종료, 안나오면 다시 처음으로 올리기
		// 몇번만에 나왔는지 처음 나온 횟수만 횟수로 치세요? 몇번시도했는지
		int count = 0;
		int dice = 0;
		while (true) {
			count++;
			System.out.println("-------------------------------------");
			dice = (int) (Math.random() * 6) + 1;
			System.out.println(" 주사위1 : " + dice);
			if (dice != 6)
				continue;
			dice = (int) (Math.random() * 6) + 1;
			System.out.println(" 주사위2 : " + dice);
			if (dice == 5)
				break;
		}
		System.out.println(count + "회");
	}

}

/*

  
*/
