package excep_userDefine;

// 사용자 정의 익셉션 클래스는 Exception 상속 받음
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {

	}

	public BalanceInsufficientException(String msg) {
		super(msg);
	}
}
