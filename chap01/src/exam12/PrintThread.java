package exam12;

public class PrintThread extends Thread{
	
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행중");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
//				System.out.println("interrupt발생!!!");
//				e.printStackTrace();
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
