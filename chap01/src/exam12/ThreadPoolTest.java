package exam12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		WorkObject work = new WorkObject();
		ThreadA2 threadA2 = new ThreadA2(work);
		ExecutorService exec = Executors.newFixedThreadPool(4);
        exec.execute(threadA2);
        
        for (int i=0; i<5; i++) {
        	System.out.println(
        			Thread.currentThread().getName()+ "안녕");
        }
        try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        exec.shutdown();
	}

}
