package exam12;

public class DaemonTest {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);
		ast.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		ast.interrupt();
		System.out.println("메인 스레드 종료");

	}

}
