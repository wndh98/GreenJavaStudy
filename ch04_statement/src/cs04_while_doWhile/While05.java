package cs04_while_doWhile;


import java.util.Scanner;

public class While05 {
   // rock-scissors-paper game: 어느 한쪽이 3승을 거두면 game 종료
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int me;
      int com; 
      int myWin = 0, comWin = 0;
      boolean flag = true;
      int cnt = 0;
      String[] kind = {"가위", "바위", "보"}; 
      
      while(flag) {
         System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요>>>");
         me = sc.nextInt();
         com = (int) (Math.random() * 3) + 1;

         if (me > 3 || me < 1) {
            System.out.println("바보");
         } else {
            System.out.printf("나: %s vs 컴: %s \n", kind[me-1], kind[com-1]);
            // 승부 판별 - switch 사용
            switch (me - com) {
            case 1:
            case -2:
               System.out.println("사람 승리!");
               myWin++;
               break;

            case -1:
            case 2:
               System.out.println("컴퓨터 승리!");
               comWin++;
               break;

            case 0:
               System.out.println("비겼넹 ㅋㅋㅋ");
               break;

            }
            cnt++;
            System.out.println("--------------------------------------");
            System.out.printf("사람: %d승 vs 컴퓨터 %d승\n", myWin, comWin);
            if(myWin == 3 || comWin == 3) {
               flag = false;
            }
            System.out.println("--------------------------------------");
         }
      }
      System.out.println("총 " + cnt + "판 시합한 결과........ ");
      System.out.println(myWin == 3? "사람 우승!!!" : "컴퓨터 우승!!!");
      sc.close();
   }
}