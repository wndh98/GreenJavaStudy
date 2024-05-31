package thread05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolEx {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			MyThread mt = new MyThread();
//			mt.start();
//		}
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			MyThread mt = new MyThread();
			pool.submit(mt);
			
		}
		
		
		pool.shutdown();
//		pool.shutdownNow();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			pool.awaitTermination(2L, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
