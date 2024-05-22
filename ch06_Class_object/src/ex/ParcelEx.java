package ex;

import java.util.Scanner;

public class ParcelEx {
   
   //ParcelService -- 택배 서비스 관리
   //
   //Parcel -- 택배 클래스
   //int itemNum;
   //String itemName;
   //int itemState;-- itemState == 0 "주문"
//               --  itemState == 1 "접수"
//               --  itemState == 2 "배송"
//               --  itemState == 3 "완료"
   //Main -- 실행하는곳
   //1 주문 -- 주문시에는 itemNum 1~100 사이의 랜덤번호 번호가 겹칠시 새로운 번호를 발행
//         -- itemName 사용자가 임의로 입력
//       -- itemState 0으로 고정
//         생성 완료후에는 itemNum 번호 출력
   //2 주문 확인  itemNum을 입력 받을시 그에 해당하는 itemNum,ItemName,itemState(한글로)
   //3 주문 상태 변경 itemNum입력받고 itemState를 입력받아서 해당하는 아이템의 itemState 변경
   //4 주문 삭제 itemNum입력받아서 해당하는 아이템 초기화
   //5 프로그램종료
   //값입력이 잘못되면 메뉴 선택부터 다시 할수있게
	
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int itemNum;
      int itemState;
      String itemName;
      boolean run = true;
      ParcelService parcelService=ParcelService.getInstance();
      int menu;
      Parcel pc=null;
      while (run) {
         
         
         System.out.println("----------------------------------------------------");
         System.out.println("1.주문 | 2.주문 확인 | 3.주문 상태 변경 | 4.주문 삭제 | 5.프로그램종료");
         System.out.println("----------------------------------------------------");
         
         menu = sc.nextInt();
         
         switch (menu) {

         case 1:
        	 sc.nextLine();
            System.out.println("상품명 입력");
            
            itemName = sc.nextLine();
            pc=parcelService.createParcel(itemName);
            System.out.println(pc);
            break;
            
         case 2:
            System.out.println("주문번호 입력");
            itemNum=sc.nextInt();
            pc=parcelService.checkItemNum(itemNum);
            System.out.println(pc);
            break;
            
         case 3:
             System.out.println("주문번호 입력");
             itemNum=sc.nextInt();
             pc=parcelService.checkItemNum(itemNum);
             System.out.println("0.주문 1.접수 2.배송 3.완료");
             itemState=sc.nextInt();
             pc.setItemState(itemState);
             System.out.println(pc);
            break;
            
         case 4:
            System.out.println("주문번호 입력");
            
            
            break;
         case 5:
        	 System.out.println("프로그램 종료");
        	 run=false;
        	 break;
            
            default :
               System.out.println("1 ~ 5 사이의 숫자를 입력하세요");
               break;
         }
      }
      
      
      
      
      
      
      
      
      
      
   }

}

