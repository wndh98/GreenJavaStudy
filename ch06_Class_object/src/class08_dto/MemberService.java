package class08_dto;

//백엔드 - 웹 어플리케이션 + DB(배열로 처리)
public class MemberService {

	// 회원정보 저장 및 관리를 위한 DB 역할
	private Member[] members = new Member[100];
	private int count;

	// 싱글톤
	private static MemberService instance;

	private MemberService() {
		for (int i = 0; i < 5; i++) {
			members[i] = new Member("id-" + i, "pw-" + i, "name-" + i, i + 23);
			count++;
		}
	}

	public static MemberService getInstance() {
		if (instance == null) {
			instance = new MemberService();
		}
		return instance;
	}

	// 회원 가입: 프론트에서 회원정보 입력받은 결과를 보내주면 회원 객체 생성하여 DB에 저장
	// 성공 -1, 실패 - 0을 반환
	public int regist(String id, String password, String name, int age) {

		members[count++] = new Member(id, password, name, age);

		if (members[count - 1] != null) {
			return 1;
		} else {
			return 0;
		}

	}

	// 로그인: id, 비번 받아서 회원 목록에서 id에 해당하는 객체 찾고 비번 맞춰봐서 맞으면 로그인 시켜주고(세션 부여)
	// id가 없거나 비번이 틀렸으면 null 반환
	public Member login(String id, String password) {
		Member member = findMember(id);
		if (member != null) {
			if (member.getPassword().equals(password)) {
				member.setLogin(true);
				return member;
			} else {
				// id는 있는데 password가 안 맞는 경우
				return null;
			}
		} else {
			return null;
		}
	}

	// 로그아웃: id에 해당하는 회원 객체 찾아서 로그인 값 false로 바꿔줌 - 세션 삭제
	public int logout(String id) {
		Member member = findMember(id);
		if (member != null) {
			member.setLogin(false);
			return 1;
		}
		return 0;
	}

	// id로 회원 조회
	public Member selectOne(String id) {

		return findMember(id);
	}

	// id로 회원객체 찾아주는 메소드 - 없으면 null 반환
	private Member findMember(String id) {
		for (Member m : members) {
			if (m != null) {
				if (m.getId().equals(id)) {
					return m;
				}
			}
		}
		return null;
	}

	// 회원 목록
	public Member[] selectAll() {

		return members;
	}

}