package thread02;

public class ThreadA extends Thread{

		public ThreadA() {
			setName("ThreadA");
		}
		
		@Override
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println(getName() + " 가 출력했습니다.");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	
}
