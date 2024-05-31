package excep_userDefine;

public class AccEx {

	public static void main(String[] args) {
		Account acc = new Account(1000);
		try {
			acc.withdraw(3000);
			
		}catch (BalanceInsufficientException e) {
			e.printStackTrace();
		}

	}

}
