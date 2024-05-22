package class02_constructor;

public class Score {

	int kor;
	int eng;
	int math;

	// 积己磊
	public Score() {

	}

	public Score(int kor) {
		this.kor = kor;
	}

	public Score(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}

	public Score(int kor, int eng, int math) {
		// 何葛努贰胶 积己
//		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

}
