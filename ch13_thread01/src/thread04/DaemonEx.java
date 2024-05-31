package thread04;

public class DaemonEx {
	public static void main(String[] args) {
		Thread as = new AutoSave();
		as.setDaemon(true);
		as.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("메인 스레드 종료");

	}
}
