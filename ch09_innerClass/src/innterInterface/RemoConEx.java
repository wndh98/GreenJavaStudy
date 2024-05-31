package innterInterface;

public class RemoConEx {

	public static void main(String[] args) {
		Remocon rc = new Remocon() {
			@Override
			public void turnOff() {
				System.out.println("off");
				
			}
			@Override
			public void turnOn() {
				System.out.println("on");
				
			}
		};
		rc.turnOn();
		rc.turnOff();
	}

}

// 자기혼자 쓰고 자기혼자 진행하기
