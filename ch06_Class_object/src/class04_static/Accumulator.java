package class04_static;

public class Accumulator {
	// field
	int total; // instance variable - object���� ���� ���� storge
	static int grandTotal; // class variable , object�� ��ü�� �����ϴ� ����

	public Accumulator() {
		grandTotal += 10;

	}

	void accumulate(int num) {
		total += num;
		grandTotal += num;
	}

	@Override
	public String toString() {
		return "Accumulator [total=" + total + ", grandTotla="+grandTotal+"]";
	}
	
	
}
