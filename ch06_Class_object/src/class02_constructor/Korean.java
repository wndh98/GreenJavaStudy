package class02_constructor;

public class Korean {

	// field
	String nation = "Korea";
	String name;
	int age;
	String gender;

	// ������
	// �⺻ ������ - �Ű����� ���� - �ٸ� ������(�Ű����� �ִ�)�� ������ �ڵ����� �������
	public Korean() {
	}

	// �Ű����� 3��¥�� ������
	public Korean(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}
}
