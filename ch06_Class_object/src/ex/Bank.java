package ex;
//스테틱 : 전역변수
// 모든곳에서 사용?생성? 있게 해주는 키워드
// 
public class Bank {
	
	private static Bank bank;
	private PersonalAccount[] personalAccountArray = new PersonalAccount[10];
	private static int acCnt = 0;

	private Bank() {
	}

	public static Bank getInstance() {
		if (bank == null) {
			bank = new Bank();
		}
		return bank;
	}

	public void sendMoney(PersonalAccount ac1, PersonalAccount ac2, int money) {
		ac1.setBalance(ac1.getBalance() - money);
		ac2.setBalance(ac2.getBalance() + money);
	}

	public void sendMoney(PersonalAccount ac1, int money) {
		ac1.setBalance(ac1.getBalance() + money);
	}

	public PersonalAccount accountCheck(String accountNo) {
		for (PersonalAccount ac : personalAccountArray) {
			if (ac != null) {
				if (ac.getAccountNo().equals(accountNo)) {
					return ac;
				}
			}
		}
		return null;
	}

	public boolean checkPassword(PersonalAccount ac, int password) {

		if (ac.getPassword() == password) {
			return true;
		}

		return false;
	}

	public PersonalAccount setAccount(String accountNo, String bank, String owner, int password, int balance) {
		personalAccountArray[acCnt++] = new PersonalAccount(accountNo, bank, owner, password, balance);
		return personalAccountArray[acCnt - 1];
	}

}


// 두개를 못만들게 확실히 막을수있다.
// 

