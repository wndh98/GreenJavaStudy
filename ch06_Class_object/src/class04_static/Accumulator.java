package class04_static;

public class Accumulator {
	// field
	int total; // instance variable - object마다 각자 갖는 storge
	static int grandTotal; // class variable , object를 전체가 공유하는 공간

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
