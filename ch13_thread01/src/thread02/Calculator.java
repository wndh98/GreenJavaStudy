package thread02;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int num) {
		for(int i=1; i <10; i++) {
	         System.out.println(Thread.currentThread().getName()+ ": "+ i+"번");
	         try {
	            Thread.sleep(100);
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
		synchronized(this) {
			this.memory=num;
			for (int i = 1; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " - 메모리 입력" + num );
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "메모리 출력 : " + this.memory);
			}
		}
		
		
	}
}
