package api01_object;

public class Counter {
	private int no;

	public Counter(int no) {
		this.no = no;
		System.out.println(no + "번 객체 생성 완료!");
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(no + "번 객체 처리 완료");
	}
}
