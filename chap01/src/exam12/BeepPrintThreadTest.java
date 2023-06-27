package exam12;

public class BeepPrintThreadTest {

	public static void main(String[] args) {
		Runnable bt = new BeepTask();
		Thread thread = new Thread(bt);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("땡!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
