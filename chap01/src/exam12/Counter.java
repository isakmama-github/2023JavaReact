package exam12;

public class Counter extends Thread{
	
	private int count = 0;
	
	public Counter(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
	    while(count++ < 5) {
	    	System.out.print(getName() + " -> ");
	    	try {
				sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	}

}
