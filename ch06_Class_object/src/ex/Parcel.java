package ex;

//ParcelService -- 택배 서비스 관리
//
//Parcel -- 택배 클래스
//int itemNum;
//String itemName;
//int itemState;-- itemState == 0 "주문"
//            --  itemState == 1 "접수"
//            --  itemState == 2 "배송"
//            --  itemState == 3 "완료"
//Main -- 실행하는곳
//1 주문 -- 주문시에는 itemNum 1~100 사이의 랜덤번호 번호가 겹칠시 새로운 번호를 발행
//      -- itemName 사용자가 임의로 입력
//    -- itemState 0으로 고정
//      생성 완료후에는 itemNum 번호 출력
//2 주문 확인  itemNum을 입력 받을시 그에 해당하는 itemNum,ItemName,itemState(한글로)
//3 주문 상태 변경 itemNum입력받고 itemState를 입력받아서 해당하는 아이템의 itemState 변경
//4 주문 삭제 itemNum입력받아서 해당하는 아이템 초기화
//5 프로그램종료
//값입력이 잘못되면 메뉴 선택부터 다시 할수있게


public class Parcel {
   
   int itemNum;
   int itemState;
   String itemName;
   
   public Parcel() {}
   public Parcel(int itemNum, int itemState, String itemName) {
      super();
      this.itemNum = itemNum;
      this.itemState = itemState;
      this.itemName = itemName;
   }
   
   public int getItemNum() {
      return itemNum;
   }
   public void setItemNum(int itemNum) {
      this.itemNum = itemNum;
   }
   public int getItemState() {
      return itemState;
   }
   public void setItemState(int itemState) {
      this.itemState = itemState;
   }
   public String getItemName() {
      return itemName;
   }
   public void setItemName(String itemName) {
      this.itemName = itemName;
   }
   
   @Override
   public String toString() {
      return "Parcel [itemNum=" + itemNum + ", itemState=" + itemState + ", itemName=" + itemName + "]";
   }
   
   
}