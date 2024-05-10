package cs04_while_doWhile;


import java.util.Scanner;

public class While05 {
   // rock-scissors-paper game: ��� ������ 3���� �ŵθ� game ����
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int me;
      int com; 
      int myWin = 0, comWin = 0;
      boolean flag = true;
      int cnt = 0;
      String[] kind = {"����", "����", "��"}; 
      
      while(flag) {
         System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���>>>");
         me = sc.nextInt();
         com = (int) (Math.random() * 3) + 1;

         if (me > 3 || me < 1) {
            System.out.println("�ٺ�");
         } else {
            System.out.printf("��: %s vs ��: %s \n", kind[me-1], kind[com-1]);
            // �º� �Ǻ� - switch ���
            switch (me - com) {
            case 1:
            case -2:
               System.out.println("��� �¸�!");
               myWin++;
               break;

            case -1:
            case 2:
               System.out.println("��ǻ�� �¸�!");
               comWin++;
               break;

            case 0:
               System.out.println("���� ������");
               break;

            }
            cnt++;
            System.out.println("--------------------------------------");
            System.out.printf("���: %d�� vs ��ǻ�� %d��\n", myWin, comWin);
            if(myWin == 3 || comWin == 3) {
               flag = false;
            }
            System.out.println("--------------------------------------");
         }
      }
      System.out.println("�� " + cnt + "�� ������ ���........ ");
      System.out.println(myWin == 3? "��� ���!!!" : "��ǻ�� ���!!!");
      sc.close();
   }
}