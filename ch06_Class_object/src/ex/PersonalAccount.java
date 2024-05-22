package ex;

public class PersonalAccount {
	private String accountNo;
	private String bank;
	private String owner;
	private int password;
	private int balance;

	public PersonalAccount(String accountNo, String bank, String owner, int password, int balance) {
		super();
		this.accountNo = accountNo;
		this.bank = bank;
		this.owner = owner;
		this.password = password;
		this.balance = balance;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "PersonalAccount [accountNo=" + accountNo + ", bank=" + bank + ", owner=" + owner + ", password="
				+ password + ", balance=" + balance + "]";
	}

}
