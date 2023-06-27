package exam12;

public class Cook implements Runnable{
	
	private Dish dish;
	
	public Cook(Dish dish) {
		this.dish = dish;
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				cook(i);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private void cook(int i) {
		synchronized (dish) {
			while(!dish.isEmpty()) {
				try {
					dish.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			dish.setEmpty(false);
			System.out.println(i + "번째 음식이 준비되었습니다.");
			dish.notify();
			
		}
	}

}
