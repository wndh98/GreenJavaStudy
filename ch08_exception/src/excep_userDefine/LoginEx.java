package excep_userDefine;

class NoIDException extends Exception{
	public NoIDException() {
		System.out.println("아이디 불일치");
	}
	public NoIDException(String msg) {
		super(msg);
	}
}
class WorngPwException extends Exception{
	public WorngPwException() {
		System.out.println("비밀번호 불일치");
	}
	public WorngPwException(String msg) {
		super(msg);
	}
}

public class LoginEx {

	public static void main(String[] args) {
		try {
			login("blue","123");
			
		} catch(NoIDException e) {
			e.printStackTrace();
		} catch(WorngPwException e) {
			e.printStackTrace();
		}
		
	}

	private static void login(String id, String pw) throws NoIDException,WorngPwException {
		if(!id.equals("blue")) {
			//NoIDException
			throw new NoIDException();
		}else {
			System.out.println("아이디 일치");
		}
		if(!pw.equals("123")) {
			//WorngPwException
			throw new WorngPwException();
		}else {
			System.out.println("비밀번호 일치");
		}
		
	}

}
// 