package cs05_break_continue;

public class Break02 {

	public static void main(String[] args) {
		// �ֻ��� ������ 6 - 5�� ���޾� ������ ����, �ȳ����� �ٽ� ó������ �ø���
		// ������� ���Դ��� ó�� ���� Ƚ���� Ƚ���� ġ����? ����õ��ߴ���
		int count = 0;
		int dice = 0;
		while (true) {
			count++;
			System.out.println("-------------------------------------");
			dice = (int) (Math.random() * 6) + 1;
			System.out.println(" �ֻ���1 : " + dice);
			if (dice != 6)
				continue;
			dice = (int) (Math.random() * 6) + 1;
			System.out.println(" �ֻ���2 : " + dice);
			if (dice == 5)
				break;
		}
		System.out.println(count + "ȸ");
	}

}

/*

  
*/
