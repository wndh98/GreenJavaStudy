package excep_userDefine;

public class Account {

	private long balance;

	public Account(long balance) {
		this.balance = balance;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
//			System.out.println("잔고부족 : 돈이 모자랍니다.");
			throw new BalanceInsufficientException("잔고 부족");
		}
		balance -= money;
	}
}
