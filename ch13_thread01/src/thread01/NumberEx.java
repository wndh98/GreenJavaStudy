package thread01;

public class NumberEx extends Numbers implements Runnable {

	@Override
	public void run() {
		list(1, 10);
	}

	public static void main(String[] args) {
		Numbers nb = new NumberEx();
		nb.list(1, 10);
		System.out.println("---------------------------");
		Thread thread1 = new Thread(new NumberEx());
		Thread thread2 = new Thread(new NumberEx());

		thread1.start();
		thread2.start();

//		nb.list(1, 10);
		Thread thread3 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.printf("(%d)", i);

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread3.start();
		System.out.println("종료");
	}

}
