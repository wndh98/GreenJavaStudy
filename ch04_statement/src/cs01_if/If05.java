package cs01_if;

public class If05 {

	public static void main(String[] args) {
		// random���� ����(score)�� �޾� ����(grade) �ֱ�

		// 0~59: F / 60~69:D / 70~79:C / 80~89:B / 90~100:A

		int score = (int) (Math.random() * 101);
		String grade;
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		if (score >= 60) {
			int last = score % 10;
			if (last > 7 || score == 100) {
				grade += "+";
			} else if (last < 4) {
				grade += "-";
			} else {
				grade += "0";
			}
		}
		System.out.printf("������ %d���̰�, ������ %s�Դϴ�.", score, grade);

	}

}