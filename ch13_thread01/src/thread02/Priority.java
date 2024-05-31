package thread02;

public class Priority extends Thread {

	public Priority(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 2000000000; i++) {

		}

		System.out.println(getName());

	}
}
