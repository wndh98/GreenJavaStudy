package ex;
/*월급 관리 프로그램
 * 
 * 
 * 인터페이스 SalaryCalurlater
 * 필드
 * int SALRAY = 1000;
 * 메서드
 * int salaryCal 매개변수 int salary
 * 각각 직급 별로
 * boss 3배
 * Director 2배
 * Employee 1배
 * 로 구현
 * 
 * 
 * 
 * 
 * 부모 클래스 Worker 추상화
 * 
 * 
 * 필드  	
 * 		private String name; // 이름
 * 		private String position; // 직책
 * 		private int balance;	 //잔고
 * 		private int personalId;	 // 개인 아이디
 * 메소드	
 * 	각 필드의 getter setter
 *  
 *  abstract void eatLunch(int money);	
 * 
 * 
 * 
 * 자식 클래스  -> SalaryCalurlater 구현받는다
 * 
 * 	Boss
 * 
 *       보스의 personalId 는 1로 고정 다른 객체가 personalId를 1로 생성시 생성불가
 * 	Director
 * 		
 * 	Employee
 * 		
 * 
 * 월급 관리 클래스 (싱글톤)
 * SalaryService
 * 
 * Worker 배열
 * int balance  // 잔고
 * 메소드	
 * createId
 *	아이디 생성 메소드 겹칠시 다른 아이디 생성
 * checkId
 *  아이디 입력받을시 해당 사원 확인 가능
 *
 *  giveMoney
 *  월급 주는 메소드
 *  SalaryService 의 bank가 부족할시 월급 못줌
 * 기능
 * 1. 사원 입력
 * 2. 사원 확인
 * 3. 월급 발행
 * 4. 프로그램 종료
 * 
 * 
 * */


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
	}

}
// 