package thread02;

public class User extends Thread{
	//공유객체
	   private Calculator calculator;
	   
	   //필드에 계산기 객체 넣어주는 메소드
	   public void setCalculator(Calculator calculator) {
	      //스레드 명칭 부여
	      setName("User1");
	      this.calculator = calculator;
	   }
	   
	   @Override
	   public void run() {
	      calculator.setMemory(100);
	   }
}
