package class03_method;

class Cal {
	String owner; // ���� ����
	int memory; // ������ ��갪 ���� �޸�

	public Cal(String owner) {
		this.owner = owner;
	}

	// method : �Ҽӵ� Ŭ���� ������Ʈ�� ���, �ൿ
	// public : �׼��� ���� ����
	// void : ��ȯ�� ���� �޼ҵ�
	// add:�޼ҵ� �̸�(�ҹ���,_,$�� ����)
	// ():�Ű�����(�޼ҵ尡 �޾Ƽ� ����ϴ� ��) �޴� �ڸ�
	// {}: �޼ҵ尡 �����ϴ� ���
	void add(int x, int y) {
		System.out.println(x + y);
	}

	int minus(int x, int y) {
		int result = x - y;
		this.memory = result;
		return result;
	}

	void multi(int x, int y) {
		int result = x * y;
		this.memory = result;
		System.out.println(x * y);

	}

	double devide(double x, double y) {

		//this.memory = x / y;
		return x / y;
	}

	@Override
	public String toString() {
		return "Cal [owner=" + owner + ", memory=" + memory + "]";
	}

}

public class CalEx {

	public static void main(String[] args) {
		Cal c1 = new Cal("test1");

	}

}

// 

