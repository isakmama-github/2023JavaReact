package exam12;

public class WaitNotifyTest {

	public static void main(String[] args) {
		JoinThread t = new JoinThread();
		t.start();
		synchronized (t) {
			
			try {
				System.out.println("스레드t가 끝날때까지 대기..");
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("총합 : "+ t.total);

	}

}
