package class01_basic;
// Ŭ������?
// ��ü�� �����ϱ� ���� ���赵
// data�� �Լ��� ���� - 
// Ŭ���� ���̾�׷� - Ŭ���� ���赵
public class Person {
	//field : �Ӽ� - attribute, property, state, instance variable(�ν��Ͻ� ����)
	String name;
	int age;
	String nationality;
	Car car;
	// ������ : construcotr
	public Person() {} // -- �⺻ ������ - �ڵ����� �������
	
	// method : �ൿ - behavior, function
	void eat() {
		System.out.println("�Ա�");
	}
	void smile() {
		System.out.println("����");
	}
	void sayMyName() {
		System.out.println("���̸���" + name + "�Դϴ�.");
	}
}
// ��ȣ..