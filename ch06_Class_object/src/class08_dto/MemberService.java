package class08_dto;

//�鿣�� - �� ���ø����̼� + DB(�迭�� ó��)
public class MemberService {

	// ȸ������ ���� �� ������ ���� DB ����
	private Member[] members = new Member[100];
	private int count;

	// �̱���
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

	// ȸ�� ����: ����Ʈ���� ȸ������ �Է¹��� ����� �����ָ� ȸ�� ��ü �����Ͽ� DB�� ����
	// ���� -1, ���� - 0�� ��ȯ
	public int regist(String id, String password, String name, int age) {

		members[count++] = new Member(id, password, name, age);

		if (members[count - 1] != null) {
			return 1;
		} else {
			return 0;
		}

	}

	// �α���: id, ��� �޾Ƽ� ȸ�� ��Ͽ��� id�� �ش��ϴ� ��ü ã�� ��� ������� ������ �α��� �����ְ�(���� �ο�)
	// id�� ���ų� ����� Ʋ������ null ��ȯ
	public Member login(String id, String password) {
		Member member = findMember(id);
		if (member != null) {
			if (member.getPassword().equals(password)) {
				member.setLogin(true);
				return member;
			} else {
				// id�� �ִµ� password�� �� �´� ���
				return null;
			}
		} else {
			return null;
		}
	}

	// �α׾ƿ�: id�� �ش��ϴ� ȸ�� ��ü ã�Ƽ� �α��� �� false�� �ٲ��� - ���� ����
	public int logout(String id) {
		Member member = findMember(id);
		if (member != null) {
			member.setLogin(false);
			return 1;
		}
		return 0;
	}

	// id�� ȸ�� ��ȸ
	public Member selectOne(String id) {

		return findMember(id);
	}

	// id�� ȸ����ü ã���ִ� �޼ҵ� - ������ null ��ȯ
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

	// ȸ�� ���
	public Member[] selectAll() {

		return members;
	}

}