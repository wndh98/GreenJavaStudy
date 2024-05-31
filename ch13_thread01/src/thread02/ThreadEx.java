package thread02;

public class ThreadEx {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("시작스레드 이름" + main.getName());
		Thread thA = new ThreadA();
		Thread thB = new ThreadB();
		System.out.println(thA.getName() + "출발준비");
		thA.start();
		System.out.println(thB.getName() + "출발준비");
		thB.start();
		System.out.println("메인메소드끝");
		
		Thread th = new Thread(()->{
			for(int i=0;i<20;i++) {
				System.out.println("th가 출력했습니다.");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		th.start();
	}

}
