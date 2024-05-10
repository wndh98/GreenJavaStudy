package cs02_switch;

public class Sw02 {

	public static void main(String[] args) {
		// random으로 점수(score)를 받아 학점(grade) 주기

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
		System.out.printf("성적은 %d점이고, 학점은 %s입니다.", score, grade);
	}

}


