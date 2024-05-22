package class07_singleton;

//Design Pattern: ��ü�� �����ϴ� ���
//�̱���: ����ڰ� �����̾ ��ü�� �ϳ��� ��ȯ�ϴ� ���

public class DBConnectionKey {

	// int a = 9;
	// private: Ŭ���� ���ο����� ���̰� ����� ����������
//   private static DBConnectionKey instance  = new DBConnectionKey();
	private static DBConnectionKey instance;

	// private ������: Ŭ���� �ܺο����� Ŭ������ ��ü ���� �Ұ�
	private DBConnectionKey() {
	}

	// ��ü ���� ���� Ŭ������.getInstance()�� ���ο��� ������ ��ü �������ִ� �޼ҵ�
	public static DBConnectionKey getInstance() {
		// instance �ߺ� ������ ���� ���� lazy �˰���
		if (instance == null) {
			instance = new DBConnectionKey();
		}

		return instance;
	}
}

