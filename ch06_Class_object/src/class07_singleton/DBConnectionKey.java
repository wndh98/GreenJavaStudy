package class07_singleton;

//Design Pattern: 객체를 생성하는 방식
//싱글톤: 사용자가 여럿이어도 객체를 하나만 반환하는 방식

public class DBConnectionKey {

	// int a = 9;
	// private: 클래스 내부에서만 보이게 만드는 접근제한자
//   private static DBConnectionKey instance  = new DBConnectionKey();
	private static DBConnectionKey instance;

	// private 생성자: 클래스 외부에서는 클래스의 객체 생성 불가
	private DBConnectionKey() {
	}

	// 객체 생성 없이 클래스명.getInstance()로 내부에서 생성된 객체 전달해주는 메소드
	public static DBConnectionKey getInstance() {
		// instance 중복 발행을 막기 위한 lazy 알고리즘
		if (instance == null) {
			instance = new DBConnectionKey();
		}

		return instance;
	}
}

