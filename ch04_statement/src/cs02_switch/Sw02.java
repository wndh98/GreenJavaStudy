package cs02_switch;

public class Sw02 {

	public static void main(String[] args) {
		// random���� ����(score)�� �޾� ����(grade) �ֱ�

		// 0~59: F / 60~69:D / 70~79:C / 80~89:B / 90~100:A
		int score = (int) (Math.random() * 101);
		String grade = "";
		switch (score / 10) {
		case 10:
			grade = "A";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.printf("������ %d���̰�, ������ %s�Դϴ�.", score, grade);
	}

}

