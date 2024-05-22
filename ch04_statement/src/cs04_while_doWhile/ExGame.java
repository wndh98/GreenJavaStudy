package cs04_while_doWhile;

import java.util.Scanner;

public class ExGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] quest = new int[3];
		int answer = 0;
		int[] answerArr = new int[3];
		int gamestop;
		int strike = 0, ball = 0, out = 0,outCount=0;
		int count = 0;
		while (true) {
			System.out.println("게임을 그만하고 싶으면 0을 입력해주세요.");
			gamestop = sc.nextInt();
			if (gamestop == 0) {
				break;
			}
			count = 0;
			while (true) {
				
				quest[count] = (int) (Math.random() * 10);
				
				count++;
				if(count>2) {
					count=0;
					
					if(quest[0]==quest[1])continue;
					if(quest[0]==quest[2])continue;
					if(quest[1]==quest[2])continue;
					
					break;
				}
			}
			System.out.printf("정답은. %d %d %d \n",quest[0],quest[1],quest[2] );
			for (int i = 0; i < 9; i++) {
				System.out.println("3자리 숫자를 입력해주세요.");
				answer = sc.nextInt();
				answerArr[0] = answer / 100;
				answerArr[1] = answer % 100 / 10;
				answerArr[2] = answer % 10;
				for (int j = 0; j < 3; j++) {
					outCount=0;
					for (int k = 0; k < 3; k++) {
						if (quest[j] == answerArr[k] && j == k) {
							strike++;
							break;
						} else if (quest[j] == answerArr[k]) {
							ball++;
							break;
						} else {
							outCount++;
							if (outCount == 3) {
								out++;
							}
						}
					}
					if(strike==3) {break;}
				}
				System.out.println(i + " 회 ");
				System.out.printf("Strike : %d, Ball : %d , Out : %d \n", strike, ball, out);
				if (strike == 3)
					break;
				strike = 0;
				ball = 0;
				out = 0;
				outCount=0;
			}
			if (strike == 3) {
				System.out.println("승리하셨습니다.");
				System.out.printf("정답은. %d %d %d \n",quest[0],quest[1],quest[2] );
			} else {
				System.out.println("패배하셨습니다.");
				System.out.printf("정답은. %d %d %d \n",quest[0],quest[1],quest[2] );
			}
		}
	}

}
